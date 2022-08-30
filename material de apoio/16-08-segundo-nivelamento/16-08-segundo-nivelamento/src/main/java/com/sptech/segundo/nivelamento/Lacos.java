package com.sptech.segundo.nivelamento;

import java.util.Scanner;

/**
 *
 * @author miniguiti
 */
public class Lacos {

    public static void main(String[] args) {

        
        System.out.println("Exemplo 01: for de 0 a 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Exemplo 02: for de 10 a 0");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Exemplo 03: while - adivinhe o número");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Adivinhe o número: ");
        Integer numeroDigitado = leitor.nextInt();

        while (numeroDigitado != 42) {
            System.out.println("Errou !!!");

            System.out.println("Digite outro:");
            numeroDigitado = leitor.nextInt();
        }

        System.out.println("Acertou!");
        
        System.out.println("Exemplo 04: while de 0 a 10");
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        
        System.out.println("Exemplo 05: do while - adivinhe o número");
        System.out.println("Adivinhe o número: (com do while)");
       
        Integer numero;
        do{
            System.out.println("Tente acertar o número: ");
            numero = leitor.nextInt();
        }while(numero != 42);
        

    }
}
