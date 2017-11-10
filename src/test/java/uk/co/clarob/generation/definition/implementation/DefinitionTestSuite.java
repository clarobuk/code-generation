package uk.co.clarob.generation.definition.implementation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import uk.co.clarob.generation.definition.BuildersTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PathDefinitionImplementationTest.class,
        PathDefinitionBuilderImplementationTest.class,
        TypeDefinitionImplementationTest.class,
        TypeDefinitionBuilderImplementationTest.class,
        FieldDefinitionImplementationTest.class,
        BuildersImplementationTest.class,
        BuildersTest.class})
public class DefinitionTestSuite
{
}
