package uk.co.clarob.generation.generation.java;

import uk.co.clarob.generation.declaration.java.PackageDeclaration;
import uk.co.clarob.generation.generation.Writer;

import static java.util.stream.Collectors.toList;

class PackageStatement implements Statement
{
    private final PackageDeclaration packageDeclaration;

    PackageStatement(final PackageDeclaration packageDeclaration)
    {
        this.packageDeclaration = packageDeclaration;
    }

    @Override
    public Writer generate(final Writer writer)
    {
        final Delimited delimited = new Delimited(
                ".",
                packageDeclaration.getElements().stream().map(Text::new).collect(toList()));
        return writer.append("package ").append(delimited).append(";");
    }
}
