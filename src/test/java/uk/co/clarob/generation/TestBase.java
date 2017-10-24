package uk.co.clarob.generation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

public abstract class TestBase<TYPE>
{
    protected abstract TYPE constructFirstValue();
    protected abstract TYPE constructSecondValue();
    protected abstract String[] expectedFirstValueToStringElements();

    @SuppressWarnings({"ObjectEqualsNull", "EqualsWithItself"})
    @Test
    public void shouldSupportEquals()
    {
        // arrange
        final TYPE firstValue = constructFirstValue();
        final TYPE secondValue = constructSecondValue();
        final TYPE firstValueCopy = constructFirstValue();
        // act
        // assert
        assertThat(firstValue.equals(null), equalTo(false));
        assertThat(firstValue.equals(secondValue), equalTo(false));
        assertThat(firstValue.equals(firstValue), equalTo(true));
        assertThat(firstValue.equals(firstValueCopy), equalTo(true));
    }

    @Test
    public void shouldSupportHashCode()
    {
        // arrange
        final TYPE firstValue = constructFirstValue();
        final TYPE secondValue = constructSecondValue();
        final TYPE firstValueCopy = constructFirstValue();
        // act
        // assert
        assertThat(firstValue.hashCode(), equalTo(firstValueCopy.hashCode()));
        assertThat(firstValue.hashCode(), equalTo(firstValue.hashCode()));
        assertThat(firstValue.hashCode(), not(equalTo(secondValue.hashCode())));
    }

    @Test
    public void shouldSupportToString()
    {
        // arrange
        final String[] expectedElements = expectedFirstValueToStringElements();
        // act
        final String actualValue = constructFirstValue().toString();
        // assert
        if (expectedElements.length > 0)
        {
            assertThat(actualValue, startsWith(expectedElements[0]));
        }
        if (expectedElements.length > 2)
        {
            for(int index = 1; index < expectedElements.length - 1; index++)
            {
                assertThat(actualValue, containsString(expectedElements[index]));
            }
        }
        if (expectedElements.length > 1)
        {
            assertThat(actualValue, endsWith(expectedElements[expectedElements.length - 1]));
        }
    }
}
