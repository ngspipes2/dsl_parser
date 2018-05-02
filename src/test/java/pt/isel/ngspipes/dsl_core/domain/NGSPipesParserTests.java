package pt.isel.ngspipes.dsl_core.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_core.transversal.IO;
import pt.isel.ngspipes.dsl_core.transversal.ParserException;

import java.io.IOException;

import static junit.framework.TestCase.assertTrue;

public class NGSPipesParserTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private NGSPipesParser parser = new NGSPipesParser();



    @Test(expected = ParserException.class)
    public void invalidRepositoriesTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidRepositoriesTag.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 1"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void emptyRepositoriesTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/emptyRepositoriesTag.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 1"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidToolRepositoryTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidToolRepositoryTag.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 2"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidPipelineRepositoryTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidPipelineRepositoryTag.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 2"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidRepositoryIdTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidRepositoryId.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 2"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void repositoryWithoutIdTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/repositoryWithoutId.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 2"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void repositoryWithoutOpenBracketTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/repositoryWithoutOpenBracket.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("missing '{'"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void repositoryWithoutCloseBracketTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/repositoryWithoutCloseBracket.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("'}'"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void repositoryWithoutLocationTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/repositoryWithoutLocation.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("location"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidRepositoryLocationTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidRepositoryLocationTag.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("location"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidRepositoryConfigTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidRepositoryConfigTag.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("config"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidOutputsTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidOutputsTag.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 7"));
            throw e;
        }
    }

    @Test(expected = ParserException.class)
    public void invalidStepsTagTest() throws ParserException, IOException {
        String pipelineDescription = readFile("ngspipesparser/invalidStepsTag.pipes");

        try {
            parser.parse(pipelineDescription);
        } catch (ParserException e) {
            assertTrue(e.getMessage().contains("line 9"));
            throw e;
        }
    }

}
