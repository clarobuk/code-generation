package uk.co.clarob.generation.definition.implementation;


import uk.co.clarob.generation.TestBase;

import static java.util.Arrays.asList;

public class FieldDefinitionImplementationTest extends TestBase<FieldDefinitionImplementation>
{
    @Override
    protected FieldDefinitionImplementation constructFirstValue()
    {
        return new FieldDefinitionImplementation(
                new TypeDefinitionImplementation(
                        new PathDefinitionImplementation(
                                asList("uk", "co", "clarob", "generation", "definition", "implementation")),
                        "FieldDefinitionImplementation",
                        false,
                        false),
                "field",
                "description",
                "comment",
                false,
                new Object[]{});
    }

    @Override
    protected FieldDefinitionImplementation constructSecondValue()
    {
        return new FieldDefinitionImplementation(
                new TypeDefinitionImplementation(
                        new PathDefinitionImplementation(
                                asList("uk", "co", "clarob", "generation", "definition", "implementation")),
                        "FieldDefinitionImplementationTest",
                        false,
                        false),
                "field",
                "description",
                "comment",
                false,
                new Object[]{});
    }

    @Override
    protected String[] expectedFirstValueToStringElements()
    {
        return new String[]{
                "uk.co.clarob.generation.definition.implementation.FieldDefinitionImplementation@",
                "[typeDefinition=uk.co.clarob.generation.definition.implementation.TypeDefinitionImplementation@",
                "[pathDefinition=uk.co.clarob.generation.definition.implementation.PathDefinitionImplementation@",
                "[elements=[uk, co, clarob, generation, definition, implementation]],name=FieldDefinitionImplementation,primitive=false,java=false],name=field,description=description,comment=comment,mandatory=false,sampleValues={}]"};
    }
}