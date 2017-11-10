package uk.co.clarob.generation.declaration.java;

import uk.co.clarob.generation.declaration.java.implementation.BuildersImplementation;

public class Builders
{
    private Builders()
    {
        // utility class with static methods, not intended to be constructed
    }

    public static PackageDeclarationBuilder packageDeclarationBuilder()
    {
        return BuildersImplementation.packageDeclarationBuilder();
    }
}
