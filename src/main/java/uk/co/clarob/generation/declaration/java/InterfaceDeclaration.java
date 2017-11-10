package uk.co.clarob.generation.declaration.java;

public interface InterfaceDeclaration
{
    PackageDeclaration getPackageDeclaration();
    ImportDeclarations getImportDeclarations();
    String getName();
}
