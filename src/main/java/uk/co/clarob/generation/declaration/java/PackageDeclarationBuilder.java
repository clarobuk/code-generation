package uk.co.clarob.generation.declaration.java;

import uk.co.clarob.generation.definition.PathDefinition;

import java.util.List;

public interface PackageDeclarationBuilder
{
    PackageDeclarationBuilder setElements(final List<String> elements);
    PackageDeclarationBuilder setElements(final String... elements);
    PackageDeclarationBuilder setPathDefinition(final PathDefinition pathDefinition);
    PackageDeclaration build();
}
