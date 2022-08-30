package com.sptech.metodos;

/**
 *
 * @author miniguiti
 */
public class Calculadora {
   
    // Esse não é void!
    // Tem retorno, e o retorno é Double!
    // Não é legal colocar um sout/print aqui dentro,
    // porque o papel dele é somar e não exibir!
    Double somar(){
      return 10.0 + 10.0;  
    }
    
    // Método sobrecarregado:
    // O mesmo método com diferentes argumentos
    // Quando um método pode fazer mais de uma coisa
    Double somar(Double num1, Double num2){
        return num1 + num2;
    }

    Boolean isNumeroPar(Double numero){
        Boolean isPar = numero % 2 == 0;
        return isPar;
    }
    
}
