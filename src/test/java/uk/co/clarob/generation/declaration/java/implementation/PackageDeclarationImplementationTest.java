package uk.co.clarob.generation.declaration.java.implementation;

import org.junit.Test;
import uk.co.clarob.generation.TestBase;
import uk.co.clarob.generation.declaration.java.PackageDeclaration;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PackageDeclarationImplementationTest extends TestBase<PackageDeclarationImplementation>
{
    @Override
    protected PackageDeclarationImplementation constructFirstValue()
    {
        return new PackageDeclarationImplementation(asList("uk", "co", "clarob", "generation"));
    }

    @Override
    protected PackageDeclarationImplementation constructSecondValue()
    {
        return new PackageDeclarationImplementation(asList("java", "junit"));
    }

    @Override
    protected String[] expectedFirstValueToStringElements()
    {
        return new String[]{
                "uk.co.clarob.generation.declaration.java.implementation.PackageDeclarationImplementation@",
                "[elements=[uk, co, clarob, generation]]"};
    }

    @Test
    public void shouldSupportNoPath()
    {
        // arrange
        final List<String> expectedValue = emptyList();
        // act
        final List<String> actualValue = PackageDeclaration.NONE.getElements();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void shouldSupportStandardPath()
    {
        // arrange
        final List<String> expectedValue = asList("uk", "co", "clarob", "generation");
        // act
        final List<String> actualValue = new PackageDeclarationImplementation(asList("uk", "co", "clarob", "generation")).getElements();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }
}