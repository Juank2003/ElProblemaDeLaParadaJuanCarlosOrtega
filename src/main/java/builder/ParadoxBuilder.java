package builder;

import Paradox.Paradox;

public interface ParadoxBuilder {
    ParadoxBuilder setProgramCode(String programCode);
    ParadoxBuilder setProgramInput(String programInput);
    Paradox build();
}