package pt.isel.ngspipes.dsl_parser.domain.service.read.property;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;

import java.util.*;
import java.util.stream.Collectors;


public class PropertyReader {

    public Map<String, Object> parse(PipesParser.PropertiesContext properties) {
        if(properties == null)
            return new HashMap<>();

        String author = parseAuthor(properties.authorProperty());
        String description = parseDescription(properties.descriptionProperty());
        String version = parseVersion(properties.versionProperty());
        Collection<String> documentation = parseDocumentation(properties.documentationProperty());

        Map<String, Object> props = new LinkedHashMap<>();

        props.put("author", author);
        props.put("description", description);
        props.put("version", version);
        props.put("documentation", documentation);

        return props;
    }

    private String parseAuthor(PipesParser.AuthorPropertyContext author) {
        if(author == null)
            return null;

        return ParserUtils.trimQuotes(author.STRING().getText());
    }

    private String parseDescription(PipesParser.DescriptionPropertyContext description) {
        if(description == null)
            return null;

        return ParserUtils.trimQuotes(description.STRING().getText());
    }

    private String parseVersion(PipesParser.VersionPropertyContext version) {
        if(version == null)
            return null;

        return ParserUtils.trimQuotes(version.STRING().getText());
    }

    private Collection<String> parseDocumentation(PipesParser.DocumentationPropertyContext documentation) {
        if(documentation == null)
            return new LinkedList<>();

        return documentation.STRING()
            .stream()
            .map((doc) -> ParserUtils.trimQuotes(doc.getText()))
            .collect(Collectors.toList());
    }

}
