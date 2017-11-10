package uk.co.clarob.generation.definition;

public interface FieldDefinition
{
    TypeDefinition getTypeDefinition();
    String getName();
    String getDescription();
    String getComment();
    boolean mandatory();
    Object[] sampleValues();
}
