package uk.co.clarob.generation.definition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class BuildersTest
{
    @Test
    public void shouldAccessPathBuilder()
    {
        // assert
        assertThat(Builders.pathDefinitionBuilder(), notNullValue());
    }

    @Test
    public void shouldAccessTypeBuilder()
    {
        // assert
        assertThat(Builders.typeDefinitionBuilder(), notNullValue());
    }
}