package uk.co.clarob.generation.definition.implementation;

import uk.co.clarob.generation.definition.PathDefinition;
import uk.co.clarob.generation.definition.PathDefinitionBuilder;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

class PathDefinitionBuilderImplementation implements PathDefinitionBuilder
{
    private List<String> elements = new ArrayList<>();

    @Override
    public PathDefinitionBuilder setElements(final List<String> elements)
    {
        this.elements = elements;
        return this;
    }

    @Override
    public PathDefinitionBuilder setElements(final String... elements)
    {
        this.elements = asList(elements);
        return this;
    }

    @Override
    public PathDefinition build()
    {
        return new PathDefinitionImplementation(elements);
    }
}
