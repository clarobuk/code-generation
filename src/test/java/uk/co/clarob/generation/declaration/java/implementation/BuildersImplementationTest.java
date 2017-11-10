package uk.co.clarob.generation.declaration.java.implementation;

import org.junit.Test;
import uk.co.clarob.generation.declaration.java.PackageDeclarationBuilder;

import java.lang.reflect.Constructor;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class BuildersImplementationTest
{
    @Test
    public void shouldCallPrivateConstructor() throws Exception
    {
        // arrange
        final Constructor<BuildersImplementation> constructor = BuildersImplementation.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        // act
        final BuildersImplementation actualValue = constructor.newInstance();
        // assert
        assertThat(actualValue, notNullValue());
    }

    @Test
    public void shouldGetPackageDeclarationBuilder()
    {
        // act
        final PackageDeclarationBuilder actualValue = BuildersImplementation.packageDeclarationBuilder();
        // assert
        assertThat(actualValue, notNullValue());
    }
}