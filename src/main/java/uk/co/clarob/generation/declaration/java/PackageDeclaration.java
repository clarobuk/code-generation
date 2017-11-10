package uk.co.clarob.generation.declaration.java;

import java.util.Collections;
import java.util.List;

public interface PackageDeclaration
{
    PackageDeclaration NONE = Collections::emptyList;

    List<String> getElements();
}
