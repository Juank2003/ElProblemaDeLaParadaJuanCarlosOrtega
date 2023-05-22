package builder;

import Paradox.Paradox;

public class ConcreteParadoxBuilder implements ParadoxBuilder {
    private String programCode;
    private String programInput;

    @Override
    public ParadoxBuilder setProgramCode(String programCode) {
        this.programCode = programCode;
        return this;
    }

    @Override
    public ParadoxBuilder setProgramInput(String programInput) {
        this.programInput = programInput;
        return this;
    }

    @Override
    public Paradox build() {
        return new Paradox(programCode, programInput);
    }
}