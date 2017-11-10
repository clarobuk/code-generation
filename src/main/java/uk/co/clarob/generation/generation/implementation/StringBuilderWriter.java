package uk.co.clarob.generation.generation.implementation;

import uk.co.clarob.generation.generation.Writer;
import uk.co.clarob.generation.generation.java.Generator;

import static java.lang.System.lineSeparator;

public class StringBuilderWriter implements Writer
{
    private final StringBuilder stringBuilder = new StringBuilder();
    private int indent = 0;

    @Override
    public Writer newLine()
    {
        stringBuilder.append(lineSeparator());
        for (int counter = 0; counter < indent; counter++)
        {
            stringBuilder.append("    ");
        }
        return this;
    }

    @Override
    public Writer incrementIndent()
    {
        indent++;
        return this;
    }

    @Override
    public Writer decrementIndent()
    {
        indent--;
        return this;
    }

    @Override
    public Writer append(final String value)
    {
        stringBuilder.append(value);
        return this;
    }

    @Override
    public Writer append(final Generator generator)
    {
        generator.generate(this);
        return this;
    }

    @Override
    public String toString()
    {
        return stringBuilder.toString();
    }
}
