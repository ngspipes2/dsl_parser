package pt.isel.ngspipes.dsl_parser.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_parser.transversal.IO;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;

import java.io.IOException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNull;

public class NGSPipesParserTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private NGSPipesParser parser = new NGSPipesParser();



    @Test(expected = IllegalArgumentException.class)
    public void nullPipelineDescriptionTest() throws ParserException, IOException {
        parser.getFromString(null);
    }

    @Test(expected = ParserException.class)
    public void invalidRepositoriesTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidRepositoriesPrimitive.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 1"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidToolRepositoryTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidToolRepositoryPrimitive.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 2"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidPipelineRepositoryTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidPipelineRepositoryPrimitive.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 2"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidRepositoryIdTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidRepositoryId.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 2"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void repositoryWithoutIdTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/repositoryWithoutId.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 2"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void repositoryWithoutOpenBracketTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/repositoryWithoutOpenBracket.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("missing '{'"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void repositoryWithoutCloseBracketTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/repositoryWithoutCloseBracket.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("'}'"));
            throw e;
        }
    }

    @Test
    public void repositoryWithoutLocationTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/repositoryWithoutLocation.pipes");

        IPipelineDescriptor pipeline = parser.getFromString(pipelineDescription);
        IRepositoryDescriptor repository = pipeline.getRepositories().stream().findFirst().get();

        assertNull(repository.getLocation());
    }

    @Test(expected = ParserException.class)
    public void invalidRepositoryLocationTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidRepositoryLocationPrimitive.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("location"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidRepositoryConfigTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidRepositoryConfigPrimitive.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("config"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidOutputsTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidOutputsPrimitive.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 7"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidStepsTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidStepsPrimitive.pipes");

        try {
            parser.getFromString(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 9"));
            throw e;
        }
    }

}
