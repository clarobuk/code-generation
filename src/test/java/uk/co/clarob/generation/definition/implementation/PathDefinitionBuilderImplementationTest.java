package uk.co.clarob.generation.definition.implementation;

import org.junit.Test;
import uk.co.clarob.generation.definition.PathDefinition;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PathDefinitionBuilderImplementationTest
{
    @Test
    public void shouldBuildUsingElementList()
    {
        // arrange
        final PathDefinition expectedValue = new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation"));
        // act
        final PathDefinition actualValue = new PathDefinitionBuilderImplementation()
                .setElements(asList("uk", "co", "clarob", "generation"))
                .build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void shouldBuildUsingVarargsElement()
    {
        // arrange
        final PathDefinition expectedValue = new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation"));
        // act
        final PathDefinition actualValue = new PathDefinitionBuilderImplementation()
                .setElements("uk", "co", "clarob", "generation")
                .build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

}