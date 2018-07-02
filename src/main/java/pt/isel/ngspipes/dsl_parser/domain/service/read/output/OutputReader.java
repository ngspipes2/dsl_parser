package pt.isel.ngspipes.dsl_parser.domain.service.read.output;

import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.output.OutputDescriptor;

import java.util.Collection;
import java.util.LinkedList;


public class OutputReader {


    public Collection<IOutputDescriptor> parse(PipesParser.OutputsContext outputsContext) {
        if(outputsContext == null)
            return new LinkedList<>();

        return parse(outputsContext.output());
    }

    public Collection<IOutputDescriptor> parse(Collection<PipesParser.OutputContext> outputsContext) {
        if(outputsContext == null)
            return new LinkedList<>();

        Collection<IOutputDescriptor> outputsDescriptor = new LinkedList<>();

        for(PipesParser.OutputContext outputContext : outputsContext)
            outputsDescriptor.add(parse(outputContext));

        return outputsDescriptor;
    }

    public IOutputDescriptor parse(PipesParser.OutputContext outputContext) {
        if(outputContext == null)
            throw new IllegalArgumentException("OutputContext cannot be null!");

        String id = outputContext.outputId().ID().getText();
        String stepId = outputContext.outputValue().stepId().ID().getText();
        String outputName = outputContext.outputValue().outputName().ID().getText();

        return new OutputDescriptor(id, stepId, outputName);
    }

}
