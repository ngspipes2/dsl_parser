package pt.isel.ngspipes.dsl_parser.domain;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesLexer;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IParameterValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.ISimpleValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.util.Collection;
import java.util.LinkedList;

public class ParserUtils {

    public static PipesParser.RootContext getRootContext(String pipelineDescription) throws ParserException {
        try {
            PipesLexer lexer = getLexer(pipelineDescription);

            CommonTokenStream token = new CommonTokenStream(lexer);

            PipesParser parser = getParser(token);

            return parser.root();
        } catch (ParseCancellationException e) {
            throw new ParserException(e.getMessage(), e);
        }
    }

    private static PipesLexer getLexer(String pipelineDescription) {
        PipesLexer lexer = new PipesLexer(CharStreams.fromString(pipelineDescription));

        lexer.removeErrorListeners();

        lexer.addErrorListener(getErrorListener());

        return lexer;
    }

    private static PipesParser getParser(CommonTokenStream token) {
        PipesParser parser = new PipesParser(token);

        parser.removeErrorListeners();

        parser.addErrorListener(getErrorListener());

        return parser;
    }

    public static ANTLRErrorListener getErrorListener() {
        return new BaseErrorListener() {
            @Override
            public void syntaxError(
                    Recognizer<?, ?> recognizer,
                    Object offendingSymbol,
                    int line, int charPositionInLine,
                    String msg, RecognitionException e) throws ParseCancellationException {
                throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
            }
        };
    }



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

    public static String getValueAsString(IValueDescriptor valueDescriptor) throws ParserException {
        if(valueDescriptor instanceof IParameterValueDescriptor)
            return "params." + ((IParameterValueDescriptor)valueDescriptor).getParameterName();
        else if (valueDescriptor instanceof ISimpleValueDescriptor)
            if(((ISimpleValueDescriptor) valueDescriptor).getValue() instanceof String)
                return ParserUtils.embrace(((ISimpleValueDescriptor) valueDescriptor).getValue().toString());
            else
                return ((ISimpleValueDescriptor) valueDescriptor).getValue().toString();

        throw new ParserException("Unknown Value Descriptor type!");
    }

    public static String trimQuotes(String description) {
        return description.substring("\"".length(), description.length()-"\"".length());
    }

    public static String embrace(String str) {
        return "\"" + str + "\"";
    }

    public static String indent(String str, int level) {
        String indentation = "";

        while(level-- > 0)
            indentation += "\t";

        return indentation + str.replace("\n", "\n" + indentation);
    }

}
