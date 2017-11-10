package uk.co.clarob.generation.declaration.java.implementation;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import uk.co.clarob.generation.declaration.java.PackageDeclaration;

import java.util.List;

class PackageDeclarationImplementation implements PackageDeclaration
{
    private final List<String> elements;

    PackageDeclarationImplementation(final List<String> elements)
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

        if (!(thatObject instanceof PackageDeclarationImplementation))
        {
            return false;
        }

        final PackageDeclarationImplementation that = (PackageDeclarationImplementation) thatObject;

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
