package uk.co.clarob.generation.definition.implementation;

import org.junit.Test;
import uk.co.clarob.generation.definition.TypeDefinition;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static uk.co.clarob.generation.definition.PathDefinition.NONE;

public class TypeDefinitionBuilderImplementationTest
{
    @Test
    public void shouldBuildUsingPrimitiveClass()
    {
        // arrange
        final TypeDefinition expectedValue = new TypeDefinitionImplementation(NONE, "int", true, true);
        // act
        final TypeDefinition actualValue = new TypeDefinitionBuilderImplementation().setClass(int.class).build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void shouldBuildUsingJavaClass()
    {
        // arrange
        final TypeDefinition expectedValue = new TypeDefinitionImplementation(new PathDefinitionImplementation(asList("java", "lang")), "Integer", false, true);
        // act
        final TypeDefinition actualValue = new TypeDefinitionBuilderImplementation().setClass(Integer.class).build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void shouldBuildUsingSetters()
    {
        // arrange
        final TypeDefinition expectedValue = new TypeDefinitionImplementation(new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation")), "TypeDefinition", false, false);
        // act
        final TypeDefinition actualValue = new TypeDefinitionBuilderImplementation()
                .setPathDefinition(new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation")))
                .setName("TypeDefinition")
                .setPrimitive(false)
                .setJava(false)
                .build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }

    @Test
    public void shouldBuildUsingSettersWithDefaulting()
    {
        // arrange
        final TypeDefinition expectedValue = new TypeDefinitionImplementation(new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation")), "TypeDefinition", false, false);
        // act
        final TypeDefinition actualValue = new TypeDefinitionBuilderImplementation()
                .setPathDefinition(new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation")))
                .setName("TypeDefinition")
                .build();
        // assert
        assertThat(actualValue, equalTo(expectedValue));
    }
}