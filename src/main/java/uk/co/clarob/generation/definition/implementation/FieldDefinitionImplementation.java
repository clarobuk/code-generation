package uk.co.clarob.generation.definition.implementation;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import uk.co.clarob.generation.definition.FieldDefinition;
import uk.co.clarob.generation.definition.TypeDefinition;

class FieldDefinitionImplementation implements FieldDefinition
{
    private final TypeDefinition typeDefinition;
    private final String name;
    private final String description;
    private final String comment;
    private final boolean mandatory;
    private final Object[] sampleValues;

    FieldDefinitionImplementation(final TypeDefinition typeDefinition,
                                  final String name,
                                  final String description,
                                  final String comment,
                                  final boolean mandatory,
                                  final Object[] sampleValues)
    {
        this.typeDefinition = typeDefinition;
        this.name = name;
        this.description = description;
        this.comment = comment;
        this.mandatory = mandatory;
        this.sampleValues = sampleValues;
    }

    @Override
    public TypeDefinition getTypeDefinition()
    {
        return typeDefinition;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public String getComment()
    {
        return comment;
    }

    @Override
    public boolean mandatory()
    {
        return mandatory;
    }

    @Override
    public Object[] sampleValues()
    {
        return sampleValues;
    }

    @Override
    public boolean equals(final Object thatObject)
    {
        if (this == thatObject)
        {
            return true;
        }

        if (!(thatObject instanceof FieldDefinitionImplementation))
        {
            return false;
        }

        final FieldDefinitionImplementation that = (FieldDefinitionImplementation) thatObject;

        return new EqualsBuilder()
                .append(mandatory, that.mandatory)
                .append(getTypeDefinition(), that.getTypeDefinition())
                .append(getName(), that.getName())
                .append(getDescription(), that.getDescription())
                .append(getComment(), that.getComment())
                .append(sampleValues, that.sampleValues)
                .isEquals();
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(17, 37)
                .append(getTypeDefinition())
                .append(getName())
                .append(getDescription())
                .append(getComment())
                .append(mandatory)
                .append(sampleValues)
                .toHashCode();
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
                .append("typeDefinition", typeDefinition)
                .append("name", name)
                .append("description", description)
                .append("comment", comment)
                .append("mandatory", mandatory)
                .append("sampleValues", sampleValues)
                .toString();
    }
}
