package uk.co.clarob.generation.generation;

import uk.co.clarob.generation.generation.java.Generator;

public interface Writer
{
    Writer newLine();
    Writer incrementIndent();
    Writer decrementIndent();
    Writer append(final String value);
    Writer append(final Generator generator);
    String toString();
}
