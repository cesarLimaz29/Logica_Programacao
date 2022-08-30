package com.sptech.segundo.nivelamento;

/**
 *
 * @author miniguiti
 */
public class OperadorTernario {
    public static void main(String[] args) {
        Boolean bloqueado = false;
        
        String frase;
        
        if(bloqueado){
            frase = "Usuário bloqueado! :(";
        }else{
            frase = "Usuário desbloqueado! :)";
        }
        
        //Usando Operador Ternário:
        // é verdade ? se for verdade faz isso : se não faz isso
        
        frase = bloqueado ? "Usuário bloqueado!" : "Usuário desbloqueado!";
        
        System.out.println(frase);      

        //Se o salário for maior que 1000, 15% de bonus, se for menor 10%
        Double salario = 1000.0;
               
        //Com if ternário:
        Double bonus = salario > 1000.0 ? 0.15 : 0.10;
        
        //Com if:
        if(salario > 1000.0){
            bonus = 0.15;
        }else{
            bonus = 0.10;
        }
        
        System.out.println(bonus);
        
    }
}
