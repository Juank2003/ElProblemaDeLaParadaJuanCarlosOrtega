package Demo;

import Paradox.Paradox;
import adapters.ParadoxAdapter;
import executionstrategies.CountdownStrategy;
import executionstrategies.CountupStrategy;

public class Demo {
    public static void main(String[] args){
        // Crear el adaptador de la paradoja
        ParadoxAdapter paradoxAdapter = new ParadoxAdapter("", "");

        // Crear la paradoja utilizando el adaptador
        Paradox paradox = paradoxAdapter.createParadox("123", "456");

        // Ejecutar la paradoja con diferentes estrategias
        paradoxAdapter.executeParadox(paradox, new CountdownStrategy());
        System.out.println("===============================================================");
        paradoxAdapter.executeParadox(paradox, new CountupStrategy());
    }
}
