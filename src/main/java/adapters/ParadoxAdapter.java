package adapters;

import Paradox.Paradox;
import builder.ConcreteParadoxBuilder;
import builder.ParadoxBuilder;
import executionstrategies.ParadoxExecutionStrategy;

public class ParadoxAdapter implements ParadoxBuilder, ParadoxAdapterInterface {
    private String programCode;
    private String programInput;

    public ParadoxAdapter(String programCode, String programInput) {
        this.programCode = programCode;
        this.programInput = programInput;
    }

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
        ConcreteParadoxBuilder builder = new ConcreteParadoxBuilder();
        return builder.setProgramCode(programCode)
                .setProgramInput(programInput)
                .build();
    }

    @Override
    public Paradox createParadox(String programCode, String programInput) {
        return new Paradox(programCode, programInput);
    }

    public void executeParadox(Paradox paradox, ParadoxExecutionStrategy executionStrategy) {
        executionStrategy.execute(paradox);
    }
}