package pt.isel.ngspipes.dsl_core.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_core.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_core.transversal.IO;
import pt.isel.ngspipes.dsl_core.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class OutputParserTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private OutputParser outputParser = new OutputParser();



    @Test
    public void emptyOutputsTest() throws ParserException, IOException {
        PipesParser.RootContext root = NGSPipesParser.getRootContext(readFile("outputsparser/outputEmpty.pipes"));

        Collection<IOutputDescriptor> outputDescriptors = outputParser.parseAll(root.outputs().output());

        assertTrue(outputDescriptors.isEmpty());
    }

    @Test
    public void notEmptyOutputsTest() throws ParserException, IOException {
        PipesParser.RootContext root = NGSPipesParser.getRootContext(readFile("outputsparser/outputNotEmpty.pipes"));

        Collection<IOutputDescriptor> outputDescriptors = outputParser.parseAll(root.outputs().output());

        assertEquals(1, outputDescriptors.size());

        IOutputDescriptor outputDescriptor = outputDescriptors.stream().findFirst().get();

        assertEquals("output1", outputDescriptor.getName());
        assertEquals("step1", outputDescriptor.getStepId());
        assertEquals("outputName", outputDescriptor.getOutputName());
    }

    @Test
    public void _2OutputsTest() throws ParserException, IOException {
        PipesParser.RootContext root = NGSPipesParser.getRootContext(readFile("outputsparser/2Outputs.pipes"));

        Collection<IOutputDescriptor> outputDescriptors = outputParser.parseAll(root.outputs().output());

        assertEquals(2, outputDescriptors.size());

        IOutputDescriptor outputDescriptor = outputDescriptors.stream().findFirst().get();

        assertEquals("output1", outputDescriptor.getName());
        assertEquals("step1", outputDescriptor.getStepId());
        assertEquals("outputName", outputDescriptor.getOutputName());

        outputDescriptor = outputDescriptors.stream().skip(1).findFirst().get();

        assertEquals("output2", outputDescriptor.getName());
        assertEquals("step2", outputDescriptor.getStepId());
        assertEquals("outputName", outputDescriptor.getOutputName());
    }

}
