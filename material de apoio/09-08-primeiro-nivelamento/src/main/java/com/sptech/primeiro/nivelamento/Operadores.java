package com.sptech.primeiro.nivelamento;

/**
 *
 * @author miniguiti
 */
public class Operadores {
    public static void main(String[] args) {
              
        Double numero01 = 10.0;
        Double numero02 = 10.0;
        
        //Posso guardar em uma variável e exibir
        Double soma = numero01 + numero02;
        System.out.println("Soma: " + soma);
        
        //Ou Fazer a operação na hora de exibir
        System.out.println("Subtração: "+ (numero01 - numero02));
        System.out.println("Divisão: " + (numero01 / numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));
        System.out.println("Resto: " + (numero01 % numero02));
        
        // Não temos o ** (potência)
        // Para isso usamos Math.pow(1,2)
        System.out.println("Potência: " + Math.pow(2, 5));
    }
}
