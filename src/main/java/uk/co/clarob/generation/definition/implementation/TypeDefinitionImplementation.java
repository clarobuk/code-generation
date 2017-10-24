package uk.co.clarob.generation.definition.implementation;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import uk.co.clarob.generation.definition.PathDefinition;
import uk.co.clarob.generation.definition.TypeDefinition;

class TypeDefinitionImplementation implements TypeDefinition
{
    private final PathDefinition pathDefinition;
    private final String name;
    private final boolean primitive;
    private final boolean java;

    TypeDefinitionImplementation(final PathDefinition pathDefinition,
                                 final String name,
                                 final boolean primitive,
                                 final boolean java)
    {
        this.pathDefinition = pathDefinition;
        this.name = name;
        this.primitive = primitive;
        this.java = java;
    }

    @Override
    public PathDefinition getPathDefinition()
    {
        return pathDefinition;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public boolean isPrimitive()
    {
        return primitive;
    }

    @Override
    public boolean isJava()
    {
        return java;
    }

    @Override
    public boolean equals(final Object thatObject)
    {
        if (this == thatObject)
        {
            return true;
        }

        if (!(thatObject instanceof TypeDefinitionImplementation))
        {
            return false;
        }

        final TypeDefinitionImplementation that = (TypeDefinitionImplementation) thatObject;

        return new EqualsBuilder()
                .append(isPrimitive(), that.isPrimitive())
                .append(isJava(), that.isJava())
                .append(getPathDefinition(), that.getPathDefinition())
                .append(getName(), that.getName())
                .isEquals();
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(17, 37)
                .append(getPathDefinition())
                .append(getName())
                .append(isPrimitive())
                .append(isJava())
                .toHashCode();
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
                .append("pathDefinition", pathDefinition)
                .append("name", name)
                .append("primitive", primitive)
                .append("java", java)
                .toString();
    }
}
