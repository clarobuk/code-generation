package uk.co.clarob.generation.definition;

import uk.co.clarob.generation.definition.implementation.BuildersImplementation;

public class Builders
{
    public static PathDefinitionBuilder pathDefinitionBuilder()
    {
        return BuildersImplementation.pathDefinitionBuilder();
    }

    public static TypeDefinitionBuilder typeDefinitionBuilder()
    {
        return BuildersImplementation.typeDefinitionBuilder();
    }
}
