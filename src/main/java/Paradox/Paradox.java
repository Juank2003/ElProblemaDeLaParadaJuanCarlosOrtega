package Paradox;

public class Paradox {
    private String programCode;
    private String programInput;

    public Paradox(String programCode, String programInput) {
        this.programCode = programCode;
        this.programInput = programInput;
    }

    public String getProgramCode() {
        return programCode;
    }

    public String getProgramInput() {
        return programInput;
    }
}