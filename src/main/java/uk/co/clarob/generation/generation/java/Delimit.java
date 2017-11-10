package uk.co.clarob.generation.generation.java;

import uk.co.clarob.generation.generation.Writer;

import java.util.List;

import static java.util.Arrays.asList;

class Delimit implements Generator
{
    private final List<Statement> statements;

    Delimit(final List<Statement> statements)
    {
        this.statements = statements;
    }

    Delimit(final Statement... statements)
    {
        this.statements = asList(statements);
    }

    @Override
    public Writer generate(final Writer writer)
    {
        writer.newLine().append("{").incrementIndent();
        for (final Statement statement : statements)
        {
            writer.newLine().append(statement);
        }
        return writer.decrementIndent().newLine().append("}");
    }
}
