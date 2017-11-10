package uk.co.clarob.generation.generation.java;

import uk.co.clarob.generation.declaration.java.ImportDeclarations;
import uk.co.clarob.generation.declaration.java.InterfaceDeclaration;
import uk.co.clarob.generation.declaration.java.PackageDeclaration;
import uk.co.clarob.generation.definition.PathDefinition;
import uk.co.clarob.generation.generation.Writer;
import uk.co.clarob.generation.generation.implementation.StringBuilderWriter;

import static uk.co.clarob.generation.declaration.java.Builders.packageDeclarationBuilder;
import static uk.co.clarob.generation.definition.Builders.pathDefinitionBuilder;

public class InterfaceGenerator
{
    final InterfaceDeclaration interfaceDeclaration;

    public InterfaceGenerator(final InterfaceDeclaration interfaceDeclaration)
    {
        this.interfaceDeclaration = interfaceDeclaration;
    }

    Writer generate(final Writer writer)
    {
        new PackageStatement(interfaceDeclaration.getPackageDeclaration()).generate(writer);
        writer.newLine().newLine().append("interface ").append(interfaceDeclaration.getName());
        new Delimit(new PackageStatement(interfaceDeclaration.getPackageDeclaration())).generate(writer);
        return writer;
    }

    public static void main(final String... arguments)
    {
        final PathDefinition pathDefinition = pathDefinitionBuilder().setElements("co", "uk", "clarob", "generation").build();
        final PackageDeclaration packageDeclaration = packageDeclarationBuilder().setPathDefinition(pathDefinition).build();
        final Writer generate = new InterfaceGenerator(new InterfaceDeclaration()
        {
            @Override
            public PackageDeclaration getPackageDeclaration()
            {
                return packageDeclaration;
            }

            @Override
            public ImportDeclarations getImportDeclarations()
            {
                return null;
            }

            @Override
            public String getName()
            {
                return "InterfaceGenerator";
            }
        }).generate(new StringBuilderWriter());
        System.out.println(generate.toString());
    }
}
