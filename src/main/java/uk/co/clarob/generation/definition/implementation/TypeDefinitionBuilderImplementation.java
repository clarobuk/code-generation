package uk.co.clarob.generation.definition.implementation;

import uk.co.clarob.generation.definition.PathDefinition;
import uk.co.clarob.generation.definition.TypeDefinition;
import uk.co.clarob.generation.definition.TypeDefinitionBuilder;

import static uk.co.clarob.generation.definition.PathDefinition.NONE;

class TypeDefinitionBuilderImplementation implements TypeDefinitionBuilder
{
    private PathDefinition pathDefinition = NONE;
    private String name;
    private boolean primitive = false;
    private boolean java = false;

    @Override
    public TypeDefinitionBuilder setClass(final Class<?> classOfType)
    {
        if (classOfType.isPrimitive())
        {
            pathDefinition = NONE;
            java = true;
        }
        else
        {
            pathDefinition = BuildersImplementation.pathDefinitionBuilder().setElements(classOfType.getPackage().getName().split("\\.")).build();
            java = classOfType.getPackage().getName().startsWith("java");
        }
        primitive = classOfType.isPrimitive();
        name = classOfType.getSimpleName();
        return this;
    }

    @Override
    public TypeDefinitionBuilder setPathDefinition(final PathDefinition pathDefinition)
    {
        this.pathDefinition = pathDefinition;
        return this;
    }

    @Override
    public TypeDefinitionBuilder setName(final String name)
    {
        this.name = name;
        return this;
    }

    @Override
    public TypeDefinitionBuilder setPrimitive(final boolean primitive)
    {
        this.primitive = primitive;
        return this;
    }

    @Override
    public TypeDefinitionBuilder setJava(final boolean java)
    {
        this.java = java;
        return this;
    }

    @Override
    public TypeDefinition build()
    {
        return new TypeDefinitionImplementation(pathDefinition, name, primitive, java);
    }
}
