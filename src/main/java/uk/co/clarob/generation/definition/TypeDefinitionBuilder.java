package uk.co.clarob.generation.definition;

public interface TypeDefinitionBuilder
{
    TypeDefinitionBuilder setClass(final Class<?> classOfType);
    TypeDefinitionBuilder setPathDefinition(final PathDefinition pathDefinition);
    TypeDefinitionBuilder setName(final String name);
    TypeDefinitionBuilder setPrimitive(final boolean primitive);
    TypeDefinitionBuilder setJava(final boolean java);
    TypeDefinition build();
}
