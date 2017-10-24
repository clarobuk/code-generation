package uk.co.clarob.generation.definition.implementation;

import org.junit.Test;
import uk.co.clarob.generation.TestBase;
import uk.co.clarob.generation.definition.PathDefinition;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PathDefinitionImplementationTest extends TestBase<PathDefinitionImplementation>
{
    @Override
    protected PathDefinitionImplementation constructFirstValue()
    {
        return new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation"));
    }

    @Override
    protected PathDefinitionImplementation constructSecondValue()
    {
        return new PathDefinitionImplementation(asList("java", "junit"));
    }

    @Override
    protected String[] expectedFirstValueToStringElements()
    {
        return new String[]{
                "uk.co.clarob.generation.definition.implementation.PathDefinitionImplementation@",
                "[elements=[uk, co, clarob, generation]]"};
    }

    @Test
    public void shouldSupportNoPath()
    {
        // arrange
        final List<String> expectedValue = emptyList();
        // act
        final List<String> actualValue = PathDefinition.NONE.getElements();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void shouldSupportStandardPath()
    {
        // arrange
        final List<String> expectedValue = asList("uk", "co", "clarob", "generation");
        // act
        final List<String> actualValue = new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation")).getElements();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }
}