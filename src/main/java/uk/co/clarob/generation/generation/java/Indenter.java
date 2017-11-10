package uk.co.clarob.generation.generation.java;

import static java.lang.System.lineSeparator;

class Indenter
{
    private final StringBuilder stringBuilder;

    Indenter(final StringBuilder stringBuilder)
    {
        this.stringBuilder = stringBuilder;
    }

    void indent(final int indent)
    {
        for (int counter = 0; counter < indent; counter++)
        {
            stringBuilder.append("    ");
        }
    }

    void indentWithNewLine(final int indent)
    {
        stringBuilder.append(lineSeparator());
        for (int counter = 0; counter < indent; counter++)
        {
            stringBuilder.append("    ");
        }
    }
}
