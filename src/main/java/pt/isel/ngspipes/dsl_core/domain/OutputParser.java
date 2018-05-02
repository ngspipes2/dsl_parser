package pt.isel.ngspipes.dsl_core.domain;

import pt.isel.ngspipes.dsl_core.domain.antlr.PipesParser;
import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.output.OutputDescriptor;

import java.util.Collection;
import java.util.LinkedList;


public class OutputParser {

    public Collection<IOutputDescriptor> parseAll(Collection<PipesParser.OutputContext> outputsContext) {
        Collection<IOutputDescriptor> outputsDescriptor = new LinkedList<>();

        for(PipesParser.OutputContext outputContext : outputsContext)
            outputsDescriptor.add(parse(outputContext));

        return outputsDescriptor;
    }

    public IOutputDescriptor parse(PipesParser.OutputContext outputContext) {
        String id = outputContext.outputId().ID().getText();
        String stepId = outputContext.outputValue().stepId().ID().getText();
        String outputName = outputContext.outputValue().outputName().ID().getText();

        return new OutputDescriptor(id, stepId, outputName);
    }

}
