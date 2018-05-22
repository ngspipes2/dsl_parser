package pt.isel.ngspipes.dsl_parser.domain;

import org.junit.Test;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.property.PropertyReader;
import pt.isel.ngspipes.dsl_parser.transversal.IO;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;

import java.io.IOException;

import static junit.framework.TestCase.*;

public class PropertyReaderTests {

    private static String readFile(String path) throws IOException {
        path = ClassLoader.getSystemResource(path).getPath();
        return IO.read(path);
    }



    private PropertyReader propertyReader = new PropertyReader();



    @Test()
    public void nullProperties() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("propertyparser/noProperties.pipes"));

        assertNull(propertyReader.parseAuthor(root.properties()));
        assertNull(propertyReader.parseDescription(root.properties()));
        assertNull(propertyReader.parseVersion(root.properties()));
        assertEquals(0, propertyReader.parseDocumentation(root.properties()).size());
    }

    @Test()
    public void emptyProperties() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("propertyparser/emptyProperties.pipes"));

        assertNull(propertyReader.parseAuthor(root.properties()));
        assertNull(propertyReader.parseDescription(root.properties()));
        assertNull(propertyReader.parseVersion(root.properties()));
        assertEquals(0, propertyReader.parseDocumentation(root.properties()).size());
    }

    @Test()
    public void fullProperties() throws ParserException, IOException {
        PipesParser.RootContext root = ParserUtils.getRootContext(readFile("propertyparser/fullProperties.pipes"));

        assertEquals("A", propertyReader.parseAuthor(root.properties()));
        assertEquals("B", propertyReader.parseDescription(root.properties()));
        assertEquals("C", propertyReader.parseVersion(root.properties()));
        assertEquals(2, propertyReader.parseDocumentation(root.properties()).size());
        assertTrue(propertyReader.parseDocumentation(root.properties()).contains("D"));
        assertTrue(propertyReader.parseDocumentation(root.properties()).contains("E"));
    }

}
