package uk.co.clarob.generation.definition.implementation;

import uk.co.clarob.generation.TestBase;

import static java.util.Arrays.asList;

public class TypeDefinitionImplementationTest extends TestBase<TypeDefinitionImplementation>
{
    @Override
    protected TypeDefinitionImplementation constructFirstValue()
    {
        return new TypeDefinitionImplementation(
                new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation", "definition", "implementation")),
                "TypeDefinitionImplementation",
                false,
                false);
    }

    @Override
    protected TypeDefinitionImplementation constructSecondValue()
    {
        return new TypeDefinitionImplementation(
                new PathDefinitionImplementation(asList("uk", "co", "clarob", "generation", "definition", "implementation")),
                "PathDefinitionImplementation",
                false,
                false);
    }

    @Override
    protected String[] expectedFirstValueToStringElements()
    {
        return new String[]{
                "uk.co.clarob.generation.definition.implementation.TypeDefinitionImplementation@",
                "[pathDefinition=uk.co.clarob.generation.definition.implementation.PathDefinitionImplementation@",
                "[elements=[uk, co, clarob, generation, definition, implementation]],name=TypeDefinitionImplementation,primitive=false,java=false]"};
    }
}