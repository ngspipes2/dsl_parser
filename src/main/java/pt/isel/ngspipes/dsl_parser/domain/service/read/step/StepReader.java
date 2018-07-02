package pt.isel.ngspipes.dsl_parser.domain.service.read.step;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.ParameterValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.SimpleValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.StepDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.CommandExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.IExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.PipelineExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.ChainInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.ParameterInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.SimpleInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.ISpreadDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.SpreadDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor.*;

import java.util.Collection;
import java.util.LinkedList;

public class StepReader {

    public Collection<IStepDescriptor> parse(PipesParser.StepsContext stepsContext, PipesParser.RootContext context) throws ParserException {
        if(stepsContext == null)
            return new LinkedList<>();

        return parse(stepsContext.step(), context);
    }

    public Collection<IStepDescriptor> parse(Collection<PipesParser.StepContext> stepsContext, PipesParser.RootContext context) throws ParserException {
        if(context == null)
            throw new IllegalArgumentException("Context cannot be null!");

        if(stepsContext == null)
            return new LinkedList<>();

        Collection<IStepDescriptor> stepsDescriptor = new LinkedList<>();

        for(PipesParser.StepContext stepContext : stepsContext)
            stepsDescriptor.add(parse(stepContext, context));

        return stepsDescriptor;
    }

    public IStepDescriptor parse(PipesParser.StepContext stepContext, PipesParser.RootContext context) throws ParserException {
        String id = stepContext.stepId().ID().getText();
        IExecDescriptor exec = parseExec(context, stepContext.execProperty());
        IValueDescriptor executionContext = parseExecutionContext(context, stepContext.executionContextProperty());
        Collection<IInputDescriptor> inputs = parseInputs(context, stepContext.inputsProperty());
        ISpreadDescriptor spread = parseSpread(context, stepContext.spreadProperty());

        return new StepDescriptor(id, exec, executionContext, inputs, spread);
    }

    private IExecDescriptor parseExec(PipesParser.RootContext context, PipesParser.ExecPropertyContext execPropertyContext) throws ParserException {
        if(execPropertyContext == null)
            return null;

        if(execPropertyContext.commandReference() != null)
            return parseExecCommand(context, execPropertyContext.commandReference());

        if(execPropertyContext.pipelineReference() != null)
            return parseExecPipeline(context, execPropertyContext.pipelineReference());

        throw new ParserException("Exec property must be a reference to a command or a pipeline!");
    }

    private IExecDescriptor parseExecCommand(PipesParser.RootContext context, PipesParser.CommandReferenceContext commandReferenceContext) {
        String repositoryId = commandReferenceContext.repositoryId().ID().getText();
        String toolName = commandReferenceContext.toolName().ID().getText();
        String commandName = commandReferenceContext.commandName().ID().getText();

        return new CommandExecDescriptor(repositoryId, toolName, commandName);
    }

    private IExecDescriptor parseExecPipeline(PipesParser.RootContext context, PipesParser.PipelineReferenceContext pipelineReferenceContext) {
        String repositoryId = pipelineReferenceContext.repositoryId().ID().getText();
        String pipelineName = pipelineReferenceContext.pipelineName().ID().getText();

        return new PipelineExecDescriptor(repositoryId, pipelineName);
    }

    private IValueDescriptor parseExecutionContext(PipesParser.RootContext context, PipesParser.ExecutionContextPropertyContext executionContextPropertyContext) throws ParserException {
        if(executionContextPropertyContext == null)
            return null;

        if(executionContextPropertyContext.value().indirectValue() != null)
            return parseExecutionContextIndirectValue(context, executionContextPropertyContext.value().indirectValue());

        if(executionContextPropertyContext.value().directValue() != null)
            return parseExecutionContextDirectValue(context, executionContextPropertyContext.value().directValue());

        throw new ParserException("ExecutionContext property must have a string, variable or  parameter value");
    }

    private IValueDescriptor parseExecutionContextIndirectValue(PipesParser.RootContext context, PipesParser.IndirectValueContext indirectValueContext) throws ParserException {
        if(indirectValueContext.parameterName() != null)
            return new ParameterValueDescriptor(indirectValueContext.parameterName().ID().getText());

        if(indirectValueContext.variableName() != null)
            return new SimpleValueDescriptor(ParserUtils.getVariableValue(context.valueDeclaration(), indirectValueContext.variableName().ID().getText()));

        throw new ParserException("ExecutionContext property has indirect value but it is not a variable neither a parameter!");
    }

    private IValueDescriptor parseExecutionContextDirectValue(PipesParser.RootContext context, PipesParser.DirectValueContext directValueContext) throws ParserException {
        return new SimpleValueDescriptor(ParserUtils.parseDirectValue(directValueContext));
    }

    private Collection<IInputDescriptor> parseInputs(PipesParser.RootContext context, PipesParser.InputsPropertyContext inputsPropertyContext) throws ParserException {
        if(inputsPropertyContext == null)
            return new LinkedList<>();

        Collection<IInputDescriptor> inputs = new LinkedList<>();

        for(PipesParser.InputPropertyContext input : inputsPropertyContext.inputProperty())
            inputs.add(parseInput(context, input));

        return inputs;
    }

    private IInputDescriptor parseInput(PipesParser.RootContext context, PipesParser.InputPropertyContext input) throws ParserException {
        if(input.inputValue().chain() != null)
            return parseInputChain(context, input.inputName().ID().getText(), input.inputValue().chain());

        if(input.inputValue().value() != null)
            return parseInputValue(context, input.inputName().ID().getText(), input.inputValue().value());

        throw new ParserException("Input must have a chain or a value!");
    }

    private IInputDescriptor parseInputChain(PipesParser.RootContext context, String inputName, PipesParser.ChainContext chain) {
        String stepId = chain.stepId().ID().getText();
        String outputName = chain.outputName().ID().getText();

        return new ChainInputDescriptor(inputName, stepId, outputName);
    }

    private IInputDescriptor parseInputValue(PipesParser.RootContext context, String inputName, PipesParser.ValueContext value) throws ParserException {
        if(value.indirectValue() != null)
            return parseInputIndirectValue(context, inputName, value.indirectValue());

        if(value.directValue() != null)
            return parseInputDirectValue(context, inputName, value.directValue());

        throw new ParserException("Input " + inputName + " must have a value, a variable or a parameter!");
    }

    private IInputDescriptor parseInputIndirectValue(PipesParser.RootContext context, String inputName, PipesParser.IndirectValueContext indirectValueContext) throws ParserException {
        if(indirectValueContext.parameterName() != null)
            return new ParameterInputDescriptor(inputName, indirectValueContext.parameterName().ID().getText());

        if(indirectValueContext.variableName() != null)
            return new SimpleInputDescriptor(inputName, ParserUtils.getVariableValue(context.valueDeclaration(), indirectValueContext.variableName().ID().getText()));

        throw new ParserException("Input " + inputName + " is a indirect value but it isn't a parameter nor a variable!");
    }

    private IInputDescriptor parseInputDirectValue(PipesParser.RootContext context, String inputName, PipesParser.DirectValueContext directValueContext) throws ParserException {
        return new SimpleInputDescriptor(inputName, ParserUtils.parseDirectValue(directValueContext));
    }

    private ISpreadDescriptor parseSpread(PipesParser.RootContext context, PipesParser.SpreadPropertyContext spreadPropertyContext) throws ParserException {
        if(spreadPropertyContext == null)
            return null;

        Collection<String> inputsToSpread = parseInputsToSpread(context, spreadPropertyContext.spreadInputsToSpreadProperty());
        ICombineStrategyDescriptor strategy = parseCombineStrategy(context, spreadPropertyContext.spreadStrategyProperty().combineStrategy());

        return new SpreadDescriptor(inputsToSpread, strategy);
    }

    private Collection<String> parseInputsToSpread(PipesParser.RootContext context, PipesParser.SpreadInputsToSpreadPropertyContext spreadInputsToSpreadPropertyContext) {
        if(spreadInputsToSpreadPropertyContext == null)
            return new LinkedList<>();

        Collection<String> inputsToSpread = new LinkedList<>();

        for(PipesParser.InputNameContext inputNameContext : spreadInputsToSpreadPropertyContext.inputName())
            inputsToSpread.add(inputNameContext.ID().getText());

        return inputsToSpread;
    }

    private ICombineStrategyDescriptor parseCombineStrategy(PipesParser.RootContext context, PipesParser.CombineStrategyContext combineStrategyContext) throws ParserException {
        if(combineStrategyContext.oneToManyStrategy() != null)
            return parseOneToManyStrategy(context, combineStrategyContext.oneToManyStrategy());

        if(combineStrategyContext.oneToOneStrategy() != null)
            return parseOneToOneStrategy(context, combineStrategyContext.oneToOneStrategy());

        throw new ParserException("Unknown combined strategy!");
    }

    private IOneToManyStrategyDescriptor parseOneToManyStrategy(PipesParser.RootContext context, PipesParser.OneToManyStrategyContext oneToManyStrategyContext) throws ParserException {
        IStrategyDescriptor firstElem = parseStrategy(context, oneToManyStrategyContext.strategyValue(0));
        IStrategyDescriptor secondElem = parseStrategy(context, oneToManyStrategyContext.strategyValue(0));

        return new OneToManyStrategyDescriptor(firstElem, secondElem);
    }

    private IOneToOneStrategyDescriptor parseOneToOneStrategy(PipesParser.RootContext context, PipesParser.OneToOneStrategyContext oneToOneStrategyContext) throws ParserException {
        IStrategyDescriptor firstElem = parseStrategy(context, oneToOneStrategyContext.strategyValue(0));
        IStrategyDescriptor secondElem = parseStrategy(context, oneToOneStrategyContext.strategyValue(1));

        return new OneToOneStrategyDescriptor(firstElem, secondElem);
    }

    private IStrategyDescriptor parseStrategy(PipesParser.RootContext context, PipesParser.StrategyValueContext strategyValueContext) throws ParserException {
        if(strategyValueContext.inputName() != null)
            return new InputStrategyDescriptor(strategyValueContext.inputName().ID().getText());

        if(strategyValueContext.combineStrategy() != null)
            return parseCombineStrategy(context, strategyValueContext.combineStrategy());

        throw new ParserException("Unknown strategy!");
    }

}

