package pt.isel.ngspipes.dsl_parser.domain.service.write.step;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IParameterValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.ISimpleValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.ICommandExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.IExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.IPipelineExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IChainInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IParameterInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.ISimpleInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.ISpreadDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor.*;

import java.util.Collection;

public class StepWriter {

    public String getAsString(Collection<IStepDescriptor> steps) throws ParserException {
        if(steps == null)
            throw new IllegalArgumentException("Steps cannot be null!");

        String stepsContent = getStepsContent(steps);

        return "Steps : " + stepsContent;
    }

    private String getStepsContent(Collection<IStepDescriptor> steps) throws ParserException {
        if(steps == null)
            return "[ ]";

        StringBuilder sb = new StringBuilder("[\n");

        String stepStr;
        for(IStepDescriptor step : steps) {
            stepStr = getAsString(step);
            stepStr = ParserUtils.indent(stepStr, 1);
            sb.append(stepStr).append("\n");
        }

        sb.append("]");

        return sb.toString();
    }

    public String getAsString(IStepDescriptor step) throws ParserException {
        if(step == null)
            throw new IllegalArgumentException("Step cannot bet null!");

        String stepId = step.getId();
        String stepContent = getStepContent(step);

        return "Step " + stepId + " : " + stepContent;
    }

    private String getStepContent(IStepDescriptor step) throws ParserException {
        StringBuilder sb = new StringBuilder("{\n");

        String exec = getExecContent(step.getExec());
        sb.append("\texec : ").append(exec).append("\n");

        if(step.getExecutionContext() != null) {
            String executionContext = getExecutionContextContent(step.getExecutionContext());
            sb.append("\texecution_context : ").append(executionContext).append("\n");
        }

        if(!step.getInputs().isEmpty()) {
            String inputs = getInputsContent(step.getInputs());
            inputs = ParserUtils.indent(inputs, 1).trim();
            sb.append("\tinputs : ").append(inputs).append("\n");
        }

        if(step.getSpread() != null){
            String spreadContent = getSpreadContent(step.getSpread());
            spreadContent = ParserUtils.indent(spreadContent ,1).trim();
            sb.append("\tspread : ").append(spreadContent).append("\n");
        }

        sb.append("}");

        return sb.toString();
    }

    private String getExecContent(IExecDescriptor exec) throws ParserException {
        String repositoryId = exec.getRepositoryId();

        if(exec instanceof IPipelineExecDescriptor) {
            String pipelineName = ((IPipelineExecDescriptor) exec).getPipelineName();
            return repositoryId + "[" + pipelineName + "]";
        } else if(exec instanceof ICommandExecDescriptor) {
            String toolName = ((ICommandExecDescriptor) exec).getToolName();
            String commandName = ((ICommandExecDescriptor) exec).getCommandName();
            return repositoryId + "[" + toolName + "]" + "[" + commandName + "]";
        }

        throw new ParserException("Unknown exec property type!");
    }

    private String getExecutionContextContent(IValueDescriptor executionContext) throws ParserException {
        if(executionContext instanceof IParameterValueDescriptor) {
            String parameterName = ((IParameterValueDescriptor) executionContext).getParameterName();
            return "params." + parameterName;
        } else if (executionContext instanceof ISimpleValueDescriptor) {
            Object value = ((ISimpleValueDescriptor) executionContext).getValue();

            if(value instanceof String)
                return ParserUtils.embrace(value.toString());
            else
                return value.toString();
        }

        throw new ParserException("Unknown Value Descriptor type!");
    }

    private String getInputsContent(Collection<IInputDescriptor> inputs) throws ParserException {
        if(inputs.isEmpty())
            return "{ }";

        StringBuilder sb = new StringBuilder("{\n");

        String inputName;
        String inputContent;
        for(IInputDescriptor input : inputs) {
            inputName = input.getInputName();
            inputContent = getInputContent(input);
            sb.append("\t").append(inputName).append(" : ").append(inputContent).append("\n");
        }

        sb.append("}");

        return sb.toString();
    }

    private String getInputContent(IInputDescriptor input) throws ParserException {
        if(input instanceof IParameterInputDescriptor) {
            String paramName = ((IParameterInputDescriptor) input).getParameterName();
            return "params." + paramName;
        } else if(input instanceof IChainInputDescriptor) {
            String stepId = ((IChainInputDescriptor) input).getStepId();
            String outputName = ((IChainInputDescriptor) input).getOutputName();
            return stepId + "[" + outputName + "]";
        } else if(input instanceof ISimpleInputDescriptor) {
            Object value = ((ISimpleInputDescriptor) input).getValue();

            if(value instanceof String)
                return ParserUtils.embrace(value.toString());
            else
                return value.toString();
        }

        throw new ParserException("Unknown input type!");
    }

    private String getSpreadContent(ISpreadDescriptor spread) throws ParserException {
        StringBuilder sb = new StringBuilder("{\n");

        String inputsToSpreadContent = getInputsToSpreadContent(spread.getInputsToSpread());
        sb.append("\tinputs_to_spread : ").append(inputsToSpreadContent).append("\n");

        if(spread.getStrategy() != null) {
            String strategyContent = getStrategyContent(spread.getStrategy());
            sb.append("\tstrategy : ").append(strategyContent).append("\n");
        }

        sb.append("}");

        return sb.toString();
    }

    private String getInputsToSpreadContent(Collection<String> inputsToSpread) {
        if(inputsToSpread.isEmpty())
            return "[ ]";

        StringBuilder sb = new StringBuilder("[");

        for(String inputName : inputsToSpread)
            sb.append(inputName).append(", ");

        sb.replace(sb.length()-", ".length(), sb.length(), "");

        sb.append("]");

        return sb.toString();
    }

    private String getStrategyContent(IStrategyDescriptor strategy) throws ParserException {
        if(strategy instanceof InputStrategyDescriptor){
            return ((InputStrategyDescriptor) strategy).getInputName();
        }else if(strategy instanceof ICombineStrategyDescriptor) {
            ICombineStrategyDescriptor combineStrategy = (ICombineStrategyDescriptor)strategy;
            String firstStrategyContent = getStrategyContent(combineStrategy.getFirstStrategy());
            String secondStrategyContent = getStrategyContent(combineStrategy.getSecondStrategy());

            if(strategy instanceof IOneToOneStrategyDescriptor) {
                return "one_to_one(" + firstStrategyContent + ", " + secondStrategyContent + ")";
            } else if(strategy instanceof IOneToManyStrategyDescriptor) {
                return "one_to_many(" + firstStrategyContent + ", " + secondStrategyContent + ")";
            }
        }

        throw new ParserException("Unknown strategy type!");
    }

}

