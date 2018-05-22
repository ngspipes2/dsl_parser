package pt.isel.ngspipes.dsl_parser.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.output.OutputReader;
import pt.isel.ngspipes.dsl_parser.transversal.IO;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

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
    public void nullOutputsContextTest() throws ParserException, IOException {
        Collection<IOutputDescriptor> outputDescriptors = outputService.parse((Collection<PipesParser.OutputContext>) null);

        assertTrue(outputDescriptors.isEmpty());
    }

    @Test
    public void emptyOutputsContextTest() throws ParserException, IOException {
        Collection<IOutputDescriptor> outputDescriptors = outputService.parse(new LinkedList<>());

        assertTrue(outputDescriptors.isEmpty());
    }

    @Test
    public void outputsContextWithOneElementTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("outputparser/1output.pipes"));

        Collection<IOutputDescriptor> outputDescriptors = outputService.parse(root.outputs().output());

        assertEquals(1, outputDescriptors.size());

        IOutputDescriptor outputDescriptor = outputDescriptors.stream().findFirst().get();

        assertEquals("output1", outputDescriptor.getName());
        assertEquals("step1", outputDescriptor.getStepId());
        assertEquals("outputName", outputDescriptor.getOutputName());
    }

    @Test
    public void regularOutputContextTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("outputparser/1output.pipes"));

        IOutputDescriptor outputDescriptor = outputService.parse(root.outputs().output(0));

        assertEquals("output1", outputDescriptor.getName());
        assertEquals("step1", outputDescriptor.getStepId());
        assertEquals("outputName", outputDescriptor.getOutputName());
    }

}
