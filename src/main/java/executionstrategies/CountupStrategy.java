package executionstrategies;

import Paradox.Paradox;

public class CountupStrategy implements ParadoxExecutionStrategy {
    @Override
    public void execute(Paradox paradox) {
        String programCode = paradox.getProgramCode();
        String programInput = paradox.getProgramInput();

        System.out.println("Executing Paradox (CountupStrategy)...");
        System.out.println("Program Code: " + programCode);
        System.out.println("Program Input: " + programInput);

        int num = 1;
        do {
            System.out.println("Displaying: " + num);
            num++;
        } while (num != 0);
    }
}