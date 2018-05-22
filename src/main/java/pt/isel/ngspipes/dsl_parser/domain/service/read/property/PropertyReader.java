package pt.isel.ngspipes.dsl_parser.domain.service.read.property;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;


public class PropertyReader {

    public String parseAuthor(PipesParser.PropertiesContext properties) {
        if(properties == null || properties.authorProperty() == null)
            return null;

        String author = properties.authorProperty().STRING().getText();
        author = ParserUtils.trimQuotes(author);

        return author;
    }

    public String parseDescription(PipesParser.PropertiesContext properties) {
        if(properties == null || properties.descriptionProperty() == null)
            return null;

        String description = properties.descriptionProperty().STRING().getText();
        description = ParserUtils.trimQuotes(description);

        return description;
    }

    public String parseVersion(PipesParser.PropertiesContext properties) {
        if(properties == null || properties.authorProperty() == null)
            return null;

        String version = properties.versionProperty().STRING().getText();
        version = ParserUtils.trimQuotes(version);

        return version;
    }

    public Collection<String> parseDocumentation(PipesParser.PropertiesContext properties) {
        if(properties == null || properties.authorProperty() == null)
            return new LinkedList<>();


        return properties.documentationProperty().STRING()
            .stream()
            .map((doc) -> ParserUtils.trimQuotes(doc.getText()))
            .collect(Collectors.toList());
    }

}
