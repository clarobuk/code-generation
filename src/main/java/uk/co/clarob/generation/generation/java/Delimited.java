package uk.co.clarob.generation.generation.java;

import uk.co.clarob.generation.generation.Writer;

import java.util.List;

class Delimited implements Generator
{
    private final String delimiter;
    private final List<Generator> elements;

    Delimited(final String delimiter, final List<Generator> elements)
    {
        this.delimiter = delimiter;
        this.elements = elements;
    }

    @Override
    public Writer generate(final Writer writer)
    {
        boolean first = true;
        for (final Generator element : elements)
        {
            if (first)
            {
                first = false;
            }
            else
            {
                writer.append(delimiter);
            }
            writer.append(element);
        }
        return writer;
    }
}
