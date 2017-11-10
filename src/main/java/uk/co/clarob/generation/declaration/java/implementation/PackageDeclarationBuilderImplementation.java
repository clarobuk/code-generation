package uk.co.clarob.generation.declaration.java.implementation;

import uk.co.clarob.generation.declaration.java.PackageDeclaration;
import uk.co.clarob.generation.declaration.java.PackageDeclarationBuilder;
import uk.co.clarob.generation.definition.PathDefinition;

import java.util.List;

import static java.util.Arrays.asList;

class PackageDeclarationBuilderImplementation implements PackageDeclarationBuilder
{
    private List<String> elements = null;

    @Override
    public PackageDeclarationBuilder setElements(final List<String> elements)
    {
        this.elements = elements;
        return this;
    }

    @Override
    public PackageDeclarationBuilder setElements(final String... elements)
    {
        this.elements = asList(elements);
        return this;
    }

    @Override
    public PackageDeclarationBuilder setPathDefinition(final PathDefinition pathDefinition)
    {
        elements = pathDefinition.getElements();
        return this;
    }

    @Override
    public PackageDeclaration build()
    {
        return new PackageDeclarationImplementation(elements);
    }
}
