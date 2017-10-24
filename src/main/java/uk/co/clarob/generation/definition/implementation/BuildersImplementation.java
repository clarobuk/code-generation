package uk.co.clarob.generation.definition.implementation;

import uk.co.clarob.generation.definition.PathDefinitionBuilder;
import uk.co.clarob.generation.definition.TypeDefinitionBuilder;

public class BuildersImplementation
{
    private BuildersImplementation()
    {
        // cannot be constructed
    }

    public static PathDefinitionBuilder pathDefinitionBuilder()
    {
        return new PathDefinitionBuilderImplementation();
    }

    public static TypeDefinitionBuilder typeDefinitionBuilder()
    {
        return new TypeDefinitionBuilderImplementation();
    }
}
