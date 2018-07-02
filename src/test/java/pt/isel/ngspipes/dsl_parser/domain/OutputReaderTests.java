package pt.isel.ngspipes.dsl_parser.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.output.OutputReader;
import pt.isel.ngspipes.dsl_parser.transversal.IO;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;

import java.io.IOException;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class OutputReaderTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private OutputReader outputService = new OutputReader();



    @Test(expected = IllegalArgumentException.class)
    public void nullOutputContextTest() throws ParserException, IOException {
        outputService.parse((PipesParser.OutputContext) null);
    }

    @Test
    public void noOutputsPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("outputparser/noOutputsPrimitive.pipes"));

        Collection<IOutputDescriptor> outputDescriptors = outputService.parse(root.outputs());

        assertEquals(0, outputDescriptors.size());
    }

    @Test
    public void emptyOutputsPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("outputparser/emptyOutputsPrimitive.pipes"));

        Collection<IOutputDescriptor> outputDescriptors = outputService.parse(root.outputs().output());

        assertTrue(outputDescriptors.isEmpty());
    }

    @Test
    public void fullOutputsPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("outputparser/fullOutputsPrimitive.pipes"));

        Collection<IOutputDescriptor> outputDescriptors = outputService.parse(root.outputs().output());

        assertEquals(1, outputDescriptors.size());

        IOutputDescriptor outputDescriptor = outputDescriptors.stream().findFirst().get();

        assertEquals("outputId", outputDescriptor.getName());
        assertEquals("stepId", outputDescriptor.getStepId());
        assertEquals("outputName", outputDescriptor.getOutputName());
    }

}
