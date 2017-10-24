package uk.co.clarob.generation.definition.implementation;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import uk.co.clarob.generation.definition.PathDefinition;

import java.util.List;

class PathDefinitionImplementation implements PathDefinition
{
    private final List<String> elements;

    PathDefinitionImplementation(final List<String> elements)
    {
        this.elements = elements;
    }

    @Override
    public List<String> getElements()
    {
        return elements;
    }

    @Override
    public boolean equals(final Object thatObject)
    {
        if (this == thatObject)
        {
            return true;
        }

        if (!(thatObject instanceof PathDefinitionImplementation))
        {
            return false;
        }

        final PathDefinitionImplementation that = (PathDefinitionImplementation) thatObject;

        return new EqualsBuilder()
                .append(getElements(), that.getElements())
                .isEquals();
    }

    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(17, 37)
                .append(getElements())
                .toHashCode();
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
                .append("elements", elements)
                .toString();
    }
}
