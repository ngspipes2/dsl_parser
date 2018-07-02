package pt.isel.ngspipes.dsl_parser.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.step.StepReader;
import pt.isel.ngspipes.dsl_parser.transversal.IO;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.ISimpleValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.ICommandExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.IPipelineExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IChainInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IParameterInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.ISimpleInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor.IInputStrategyDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor.IOneToOneStrategyDescriptor;

import java.io.IOException;
import java.util.Collection;

import static junit.framework.TestCase.*;

public class StepReaderTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private StepReader stepService = new StepReader();



    @Test
    public void noStepsPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("stepparser/noStepsPrimitive.pipes"));

        Collection<IStepDescriptor> stepsDescriptor = stepService.parse(root.steps(), root);

        assertEquals(0, stepsDescriptor.size());
    }

    @Test
    public void emptyStepsPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("stepparser/emptyStepsPrimitive.pipes"));

        Collection<IStepDescriptor> stepsDescriptor = stepService.parse(root.steps().step(), root);

        assertEquals(0, stepsDescriptor.size());
    }

    @Test
    public void fullStepTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("stepparser/fullStepPrimitive.pipes"));

        Collection<IStepDescriptor> stepsDescriptor = stepService.parse(root.steps().step(), root);

        assertEquals(3, stepsDescriptor.size());

        IStepDescriptor stepDescriptor = stepsDescriptor.stream().findFirst().get();

        assertEquals("step0", stepDescriptor.getId());
        assertTrue(stepDescriptor.getExec() instanceof ICommandExecDescriptor);
        assertEquals("tRepo", stepDescriptor.getExec().getRepositoryId());
        assertEquals("tool", ((ICommandExecDescriptor)stepDescriptor.getExec()).getToolName());
        assertEquals("command", ((ICommandExecDescriptor)stepDescriptor.getExec()).getCommandName());
        assertTrue(stepDescriptor.getExecutionContext() instanceof ISimpleValueDescriptor);
        assertEquals("Docker", ((ISimpleValueDescriptor)stepDescriptor.getExecutionContext()).getValue());

        stepDescriptor = stepsDescriptor.stream().skip(1).findFirst().get();
        assertEquals("step1", stepDescriptor.getId());
        assertTrue(stepDescriptor.getExec() instanceof IPipelineExecDescriptor);
        assertEquals("pRepo", stepDescriptor.getExec().getRepositoryId());
        assertEquals("pipeline", ((IPipelineExecDescriptor)stepDescriptor.getExec()).getPipelineName());

        stepDescriptor = stepsDescriptor.stream().skip(2).findFirst().get();
        assertEquals("step2", stepDescriptor.getId());

        Collection<IInputDescriptor> inputsDescriptor = stepDescriptor.getInputs();
        assertEquals(6, inputsDescriptor.size());

        IInputDescriptor inputDescriptor = inputsDescriptor.stream().findFirst().get();
        assertEquals("string", inputDescriptor.getInputName());
        assertTrue(inputDescriptor instanceof ISimpleInputDescriptor);
        assertEquals("str", ((ISimpleInputDescriptor)inputDescriptor).getValue());

        inputDescriptor = inputsDescriptor.stream().skip(1).findFirst().get();
        assertEquals("number", inputDescriptor.getInputName());
        assertTrue(inputDescriptor instanceof ISimpleInputDescriptor);
        assertEquals(1, ((ISimpleInputDescriptor)inputDescriptor).getValue());

        inputDescriptor = inputsDescriptor.stream().skip(2).findFirst().get();
        assertEquals("variable", inputDescriptor.getInputName());
        assertTrue(inputDescriptor instanceof ISimpleInputDescriptor);
        assertEquals("varValue", ((ISimpleInputDescriptor)inputDescriptor).getValue());

        inputDescriptor = inputsDescriptor.stream().skip(3).findFirst().get();
        assertEquals("param", inputDescriptor.getInputName());
        assertTrue(inputDescriptor instanceof IParameterInputDescriptor);
        assertEquals("param", ((IParameterInputDescriptor)inputDescriptor).getParameterName());

        inputDescriptor = inputsDescriptor.stream().skip(4).findFirst().get();
        assertEquals("ch1", inputDescriptor.getInputName());
        assertTrue(inputDescriptor instanceof IChainInputDescriptor);
        assertEquals("step0", ((IChainInputDescriptor)inputDescriptor).getStepId());
        assertEquals("out", ((IChainInputDescriptor)inputDescriptor).getOutputName());

        inputDescriptor = inputsDescriptor.stream().skip(5).findFirst().get();
        assertEquals("ch2", inputDescriptor.getInputName());
        assertTrue(inputDescriptor instanceof IChainInputDescriptor);
        assertEquals("step1", ((IChainInputDescriptor)inputDescriptor).getStepId());
        assertEquals("out", ((IChainInputDescriptor)inputDescriptor).getOutputName());

        assertEquals(2, stepDescriptor.getSpread().getInputsToSpread().size());
        assertEquals("ch1", stepDescriptor.getSpread().getInputsToSpread().stream().findFirst().get());
        assertEquals("ch2", stepDescriptor.getSpread().getInputsToSpread().stream().skip(1).findFirst().get());

        assertTrue(stepDescriptor.getSpread().getStrategy() instanceof IOneToOneStrategyDescriptor);

        IOneToOneStrategyDescriptor strategyDescriptor = (IOneToOneStrategyDescriptor) stepDescriptor.getSpread().getStrategy();
        assertTrue(strategyDescriptor.getFirstStrategy() instanceof IInputStrategyDescriptor);
        assertEquals("ch1", ((IInputStrategyDescriptor)strategyDescriptor.getFirstStrategy()).getInputName());
        assertTrue(strategyDescriptor.getSecondStrategy() instanceof IInputStrategyDescriptor);
        assertEquals("ch2", ((IInputStrategyDescriptor)strategyDescriptor.getSecondStrategy()).getInputName());
    }

    @Test
    public void emptyInputsPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("stepparser/emptyInputsPrimitive.pipes"));

        Collection<IStepDescriptor> stepsDescriptor = stepService.parse(root.steps().step(), root);

        assertEquals(0, stepsDescriptor.stream().findFirst().get().getInputs().size());
    }

    @Test
    public void noInputsPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("stepparser/noInputsPrimitive.pipes"));

        Collection<IStepDescriptor> stepsDescriptor = stepService.parse(root.steps().step(), root);

        assertEquals(0, stepsDescriptor.stream().findFirst().get().getInputs().size());
    }

    @Test
    public void noExecutionContextPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("stepparser/noExecutionContextPrimitive.pipes"));

        Collection<IStepDescriptor> stepsDescriptor = stepService.parse(root.steps().step(), root);

        assertNull(stepsDescriptor.stream().findFirst().get().getExecutionContext());
    }

}
