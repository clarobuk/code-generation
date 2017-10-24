package uk.co.clarob.generation.definition.implementation;

import org.junit.Test;

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

}