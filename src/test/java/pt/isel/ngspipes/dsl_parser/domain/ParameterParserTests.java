package pt.isel.ngspipes.dsl_parser.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.parameter.ParameterReader;
import pt.isel.ngspipes.dsl_parser.transversal.IO;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;

import java.io.IOException;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

public class ParameterParserTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private ParameterReader parameterService = new ParameterReader();



    @Test(expected = IllegalArgumentException.class)
    public void nullContextTest() throws ParserException, IOException {
        parameterService.parse(null);
    }

    @Test
    public void defaultParameterTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("parameterparser/defaultParameter.pipes"));

        Collection<IParameterDescriptor> parameterDescriptors = parameterService.parse(root);

        assertEquals(1, parameterDescriptors.size());

        IParameterDescriptor parameterDescriptor = parameterDescriptors.stream().findFirst().get();

        assertEquals("param", parameterDescriptor.getName());
        assertEquals("paramValue", parameterDescriptor.getDefaultValue());
    }

    @Test
    public void repositoryParameterTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("parameterparser/repositoryParameter.pipes"));

        Collection<IParameterDescriptor> parameterDescriptors = parameterService.parse(root);

        assertEquals(1, parameterDescriptors.size());

        IParameterDescriptor parameterDescriptor = parameterDescriptors.stream().findFirst().get();

        assertEquals("param", parameterDescriptor.getName());
        assertEquals(null, parameterDescriptor.getDefaultValue());
    }

    @Test
    public void stepParameterTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("parameterparser/stepParameter.pipes"));

        Collection<IParameterDescriptor> parameterDescriptors = parameterService.parse(root);

        assertEquals(1, parameterDescriptors.size());

        IParameterDescriptor parameterDescriptor = parameterDescriptors.stream().findFirst().get();

        assertEquals("param", parameterDescriptor.getName());
        assertEquals(null, parameterDescriptor.getDefaultValue());
    }

}
