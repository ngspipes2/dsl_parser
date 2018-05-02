package pt.isel.ngspipes.dsl_core.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_core.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_core.transversal.IO;
import pt.isel.ngspipes.dsl_core.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.PipelineRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.ToolRepositoryDescriptor;
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



    private RepositoryParser repositoryParser = new RepositoryParser();



    @Test
    public void _1RepositoryTest() throws ParserException, IOException {
        PipesParser.RootContext root = NGSPipesParser.getRootContext(readFile("repositoryparser/1Repository.pipes"));

        Collection<IRepositoryDescriptor> repositoryDescriptors = new LinkedList<>();
        for(PipesParser.RepositoryContext  repositoryContext : root.repositories().repository())
            repositoryDescriptors.add(repositoryParser.parse(repositoryContext, root));

        assertEquals(1, repositoryDescriptors.size());

        IRepositoryDescriptor repositoryDescriptor = repositoryDescriptors.stream().findFirst().get();

        assertTrue(repositoryDescriptor instanceof ToolRepositoryDescriptor);
        assertEquals("repo", repositoryDescriptor.getId());
        assertEquals("https://location", repositoryDescriptor.getLocation());
        assertNotNull(repositoryDescriptor.getConfiguration());
        assertEquals(0, repositoryDescriptor.getConfiguration().size());
    }

    @Test
    public void _2RepositoriesTest() throws ParserException, IOException {
        PipesParser.RootContext root = NGSPipesParser.getRootContext(readFile("repositoryparser/2Repositories.pipes"));

        Collection<IRepositoryDescriptor> repositoryDescriptors = repositoryParser.parseAll(root.repositories().repository(), root);

        assertEquals(2, repositoryDescriptors.size());

        IRepositoryDescriptor repositoryDescriptor = repositoryDescriptors.stream().findFirst().get();

        assertTrue(repositoryDescriptor instanceof ToolRepositoryDescriptor);
        assertEquals("tRepo", repositoryDescriptor.getId());
        assertEquals("https://location", repositoryDescriptor.getLocation());
        assertNotNull(repositoryDescriptor.getConfiguration());
        assertEquals(0, repositoryDescriptor.getConfiguration().size());

        repositoryDescriptor = repositoryDescriptors.stream().skip(1).findFirst().get();

        assertTrue(repositoryDescriptor instanceof PipelineRepositoryDescriptor);
        assertEquals("pRepo", repositoryDescriptor.getId());
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
