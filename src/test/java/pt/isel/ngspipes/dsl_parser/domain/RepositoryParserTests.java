package pt.isel.ngspipes.dsl_parser.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.repository.RepositoryReader;
import pt.isel.ngspipes.dsl_parser.transversal.IO;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.repository.IPipelineRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IToolRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IParameterValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.ISimpleValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

import static junit.framework.TestCase.*;

public class RepositoryParserTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private RepositoryReader repositoryService = new RepositoryReader();


    @Test(expected = IllegalArgumentException.class)
    public void nullRepositoryContextTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("repositoryparser/toolRepository.pipes"));

        repositoryService.parse((PipesParser.RepositoryContext)null, root);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullRepositoriesContextTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("repositoryparser/toolRepository.pipes"));

        repositoryService.parse((Collection<PipesParser.RepositoryContext>)null, root);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseWithNullContextTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("repositoryparser/toolRepository.pipes"));

        repositoryService.parse(root.repositories().repository(0), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseAllWithNullContextTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("repositoryparser/toolRepository.pipes"));

        repositoryService.parse(root.repositories().repository(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyRepositoriesContextTest() throws ParserException, IOException {
        Collection<IRepositoryDescriptor> repositoriesDescriptor = repositoryService.parse(new LinkedList<>(), null);

        assertTrue(repositoriesDescriptor.isEmpty());
    }

    @Test
    public void nonEmptyRepositoriesContextTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("repositoryparser/toolRepository.pipes"));

        Collection<IRepositoryDescriptor> repositoriesDescriptor = repositoryService.parse(root.repositories().repository(), root);

        assertEquals(1, repositoriesDescriptor.size());
    }

    @Test
    public void toolRepositoryTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("repositoryparser/toolRepository.pipes"));

        Collection<IRepositoryDescriptor> repositoryDescriptors = repositoryService.parse(root.repositories().repository(), root);

        assertEquals(1, repositoryDescriptors.size());

        IRepositoryDescriptor repositoryDescriptor = repositoryDescriptors.stream().findFirst().get();

        assertTrue(repositoryDescriptor instanceof IToolRepositoryDescriptor);
        assertEquals("repo", repositoryDescriptor.getId());
        assertEquals("https://location", repositoryDescriptor.getLocation());
        assertNotNull(repositoryDescriptor.getConfiguration());
        assertEquals(0, repositoryDescriptor.getConfiguration().size());
    }

    @Test
    public void pipelineRepositoryTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("repositoryparser/pipelineRepository.pipes"));

        Collection<IRepositoryDescriptor> repositoryDescriptors = repositoryService.parse(root.repositories().repository(), root);

        assertEquals(1, repositoryDescriptors.size());

        IRepositoryDescriptor repositoryDescriptor = repositoryDescriptors.stream().findFirst().get();

        assertTrue(repositoryDescriptor instanceof IPipelineRepositoryDescriptor);
        assertEquals("repo", repositoryDescriptor.getId());
        assertEquals("https://location", repositoryDescriptor.getLocation());
        assertNotNull(repositoryDescriptor.getConfiguration());
        assertEquals(4, repositoryDescriptor.getConfiguration().size());

        assertTrue(repositoryDescriptor.getConfiguration().containsKey("string"));
        assertTrue(repositoryDescriptor.getConfiguration().containsKey("number"));
        assertTrue(repositoryDescriptor.getConfiguration().containsKey("variable"));
        assertTrue(repositoryDescriptor.getConfiguration().containsKey("parameter"));

        IValueDescriptor configValue = repositoryDescriptor.getConfiguration().get("string");
        assertTrue(configValue instanceof ISimpleValueDescriptor);
        assertEquals("propertyValue1", ((ISimpleValueDescriptor)configValue).getValue());

        configValue = repositoryDescriptor.getConfiguration().get("number");
        assertTrue(configValue instanceof ISimpleValueDescriptor);
        assertEquals(2, ((ISimpleValueDescriptor)configValue).getValue());

        configValue = repositoryDescriptor.getConfiguration().get("variable");
        assertTrue(configValue instanceof ISimpleValueDescriptor);
        assertEquals("value", ((ISimpleValueDescriptor)configValue).getValue());

        configValue = repositoryDescriptor.getConfiguration().get("parameter");
        assertTrue(configValue instanceof IParameterValueDescriptor);
        assertEquals("param", ((IParameterValueDescriptor)configValue).getParameterName());
    }

}
