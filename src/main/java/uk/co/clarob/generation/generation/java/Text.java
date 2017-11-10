package uk.co.clarob.generation.generation.java;

import uk.co.clarob.generation.generation.Writer;

class Text implements Generator
{
    private final String value;

    Text(final String value)
    {
        this.value = value;
    }

    @Override
    public Writer generate(final Writer writer)
    {
        writer.append(value);
        return writer;
    }
}
