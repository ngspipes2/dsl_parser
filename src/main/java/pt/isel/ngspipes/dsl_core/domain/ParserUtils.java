package pt.isel.ngspipes.dsl_core.domain;

import pt.isel.ngspipes.dsl_core.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_core.transversal.ParserException;

import java.util.Collection;
import java.util.LinkedList;

public class ParserUtils {

    public static Object parseDirectValue(PipesParser.DirectValueContext directValueContext) throws ParserException {
        if(directValueContext.STRING() != null)
            return ParserUtils.trimQuotes(directValueContext.STRING().getText());

        if(directValueContext.NUMBER() != null)
            if(directValueContext.NUMBER().getText().contains("."))
                return Double.parseDouble(directValueContext.NUMBER().getText());
            else
                return Integer.parseInt(directValueContext.NUMBER().getText());

        if(directValueContext.BOOLEAN() != null)
            return Boolean.parseBoolean(directValueContext.BOOLEAN().getText());

        if(directValueContext.array() != null) {
            Collection<Object> array = new LinkedList<>();

            for(PipesParser.DirectValueContext v : directValueContext.array().directValue())
                array.add(parseDirectValue(v));

            return array;
        }

        throw new ParserException("DirectValue declaration has invalid value, must be String, Number, Boolean, Array!");
    }

    public static Object getVariableValue(Collection<PipesParser.ValueDeclarationContext> valuesDeclarationContext, String variableName) throws ParserException {
        PipesParser.VariableDeclarationContext variableDeclarationContext;
        String valueVariableName;
        PipesParser.DirectValueContext directValueContext;

        for(PipesParser.ValueDeclarationContext valueDeclarationContext : valuesDeclarationContext) {
            if(valueDeclarationContext.variableDeclaration() != null) {
                variableDeclarationContext = valueDeclarationContext.variableDeclaration();
                valueVariableName = variableDeclarationContext.variableName().ID().getText();

                if(valueVariableName.equals(variableName)) {
                    directValueContext = variableDeclarationContext.variableValue().directValue();

                    try{
                        return parseDirectValue(directValueContext);
                    } catch (ParserException e) {
                        throw new ParserException("Error parsing Variable " + variableName + "."+e.getMessage(), e);
                    }
                }
            }
        }

        throw new ParserException("Variable " + variableName + " is not declared!");
    }

    public static String trimQuotes(String description) {
        return description.substring("\"".length(), description.length()-"\"".length());
    }

}
