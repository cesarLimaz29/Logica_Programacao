package com.sptech.segundo.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author miniguiti
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        
        // Também temos essas classes:
        // Math.random()
        // Random random = new Random(); //Esse é umm objeto, tipo Scanner
        
        //Esse é mais vantajoso porque já podemos definir o intervalo! :)
        Integer numeroAleatorio = 
                ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println(numeroAleatorio);
        
        //Também funciona com Double
        Double numeroAleatorioQuebrado = 
                ThreadLocalRandom.current().nextDouble(1.0, 101.0);
       
        System.out.println(numeroAleatorioQuebrado);
    }
}
