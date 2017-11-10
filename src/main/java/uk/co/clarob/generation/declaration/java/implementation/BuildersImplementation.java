package uk.co.clarob.generation.declaration.java.implementation;

import uk.co.clarob.generation.declaration.java.PackageDeclarationBuilder;

public class BuildersImplementation
{
    private BuildersImplementation()
    {
        // cannot be constructed
    }

    public static PackageDeclarationBuilder packageDeclarationBuilder()
    {
        return new PackageDeclarationBuilderImplementation();
    }
}
