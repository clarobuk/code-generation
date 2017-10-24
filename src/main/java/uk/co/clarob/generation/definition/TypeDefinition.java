package uk.co.clarob.generation.definition;

public interface TypeDefinition
{
    PathDefinition getPathDefinition();
    String getName();
    boolean isPrimitive();
    boolean isJava();
}
