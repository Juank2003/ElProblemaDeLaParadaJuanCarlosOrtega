package executionstrategies;

import Paradox.Paradox;

public class CountdownStrategy implements ParadoxExecutionStrategy {
    @Override
    public void execute(Paradox paradox) {
        String programCode = paradox.getProgramCode();
        String programInput = paradox.getProgramInput();

        System.out.println("Executing Paradox (CountdownStrategy)...");
        System.out.println("Program Code: " + programCode);
        System.out.println("Program Input: " + programInput);

        int num = 10;
        do {
            System.out.println("Displaying: " + num);
            num--;
        } while (num >= 0);
    }
}