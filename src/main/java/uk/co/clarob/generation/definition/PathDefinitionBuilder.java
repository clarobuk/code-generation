package uk.co.clarob.generation.definition;

import java.util.List;

public interface PathDefinitionBuilder
{
    PathDefinitionBuilder setElements(final List<String> elements);
    PathDefinitionBuilder setElements(final String... elements);
    PathDefinition build();
}
