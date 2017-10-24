package uk.co.clarob.generation.definition;

import java.util.Collections;
import java.util.List;

public interface PathDefinition
{
    PathDefinition NONE = Collections::emptyList;

    List<String> getElements();
}
