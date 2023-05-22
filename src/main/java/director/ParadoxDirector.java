package director;

import Paradox.Paradox;
import builder.ParadoxBuilder;

public class ParadoxDirector {
    private ParadoxBuilder builder;

    public ParadoxDirector(ParadoxBuilder builder) {
        this.builder = builder;
    }

    public Paradox createParadox(String programCode, String programInput) {
        return builder.setProgramCode(programCode)
                .setProgramInput(programInput)
                .build();
    }
}