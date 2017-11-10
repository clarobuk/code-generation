package uk.co.clarob.generation.declaration.java.implementation;

import org.junit.Test;
import uk.co.clarob.generation.declaration.java.PackageDeclaration;
import uk.co.clarob.generation.definition.PathDefinition;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static uk.co.clarob.generation.definition.Builders.pathDefinitionBuilder;

public class PackageDeclarationBuilderImplementationTest
{
    @Test
    public void shouldBuildUsingElementList()
    {
        // arrange
        final PackageDeclaration expectedValue = new PackageDeclarationImplementation(asList("uk", "co", "clarob", "generation"));
        // act
        final PackageDeclaration actualValue = new PackageDeclarationBuilderImplementation()
                .setElements(asList("uk", "co", "clarob", "generation"))
                .build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void shouldBuildUsingVarargsElement()
    {
        // arrange
        final PackageDeclaration expectedValue = new PackageDeclarationImplementation(asList("uk", "co", "clarob", "generation"));
        // act
        final PackageDeclaration actualValue = new PackageDeclarationBuilderImplementation()
                .setElements("uk", "co", "clarob", "generation")
                .build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void should()
    {
        // arrange
        final PathDefinition pathDefinition = pathDefinitionBuilder().setElements("uk", "co", "clarob", "generation").build();
        final PackageDeclaration expectedValue = new PackageDeclarationImplementation(asList("uk", "co", "clarob", "generation"));
        // act
        final PackageDeclaration actualValue = new PackageDeclarationBuilderImplementation()
                .setPathDefinition(pathDefinition)
                .build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

}