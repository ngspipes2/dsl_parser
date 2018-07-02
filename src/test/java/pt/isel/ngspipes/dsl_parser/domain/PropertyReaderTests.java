package pt.isel.ngspipes.dsl_parser.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.property.PropertyReader;
import pt.isel.ngspipes.dsl_parser.transversal.IO;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PropertyReaderTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private PropertyReader propertyReader = new PropertyReader();



    @Test()
    public void noPropertiesPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("propertyparser/noPropertiesPrimitive.pipes"));
        Map<String, Object> properties = propertyReader.parse(root.properties());

        assertEquals(0, properties.size());
    }

    @Test()
    public void emptyPropertiesPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("propertyparser/emptyPropertiesPrimitive.pipes"));
        Map<String, Object> properties = propertyReader.parse(root.properties());

        assertEquals(null, properties.get("author"));
        assertEquals(null, properties.get("description"));
        assertEquals(null, properties.get("version"));
        assertEquals(0, ((Collection<String>)properties.get("documentation")).size());
    }

    @Test()
    public void fullPropertiesPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("propertyparser/fullPropertiesPrimitive.pipes"));
        Map<String, Object> properties = propertyReader.parse(root.properties());

        assertEquals("A", properties.get("author"));
        assertEquals("B", properties.get("description"));
        assertEquals("C", properties.get("version"));
        assertEquals(2, ((Collection<String>)(properties.get("documentation"))).size());
        assertTrue(((Collection<String>)(properties.get("documentation"))).contains("D"));
        assertTrue(((Collection<String>)(properties.get("documentation"))).contains("E"));
    }

    @Test()
    public void noDocumentationPrimitiveTest() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("propertyparser/noDocumentationPropertiesPrimitive.pipes"));
        Map<String, Object> properties = propertyReader.parse(root.properties());

        assertEquals(0, ((Collection<String>)properties.get("documentation")).size());
    }

}
