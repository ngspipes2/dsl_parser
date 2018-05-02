package pt.isel.ngspipes.dsl_core.domain;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import pt.isel.ngspipes.dsl_core.domain.antlr.PipesLexer;
import pt.isel.ngspipes.dsl_core.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_core.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;

public class NGSPipesParser {

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

        lexer.addErrorListener(
                new BaseErrorListener() {
                    @Override
                    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                            throws ParseCancellationException {
                        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
                    }
                }
        );

        return lexer;
    }

    private static PipesParser getParser(CommonTokenStream token) {
        PipesParser parser = new PipesParser(token);

        parser.removeErrorListeners();

        parser.addErrorListener(
                new BaseErrorListener() {
                    @Override
                    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                            throws ParseCancellationException {
                        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
                    }
                }
        );

        return parser;
    }



    private PipelineParser pipelineService = new PipelineParser();



    public IPipelineDescriptor parse(String pipelineDescription) throws ParserException {
        return pipelineService.parse(getRootContext(pipelineDescription));
    }

}
