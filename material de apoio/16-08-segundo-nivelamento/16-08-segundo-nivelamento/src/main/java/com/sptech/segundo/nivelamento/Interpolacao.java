package com.sptech.segundo.nivelamento;

/**
 *
 * @author miniguiti
 */
public class Interpolacao {
    public static void main(String[] args) {
       
        // No JavaScript ${}
        // No Java
        
        String nome = "Giuliana Miniguiti";
        Integer idade = 42;
        Double altura = 1.551;
        
        // %s representa String
        // %d representa inteiros (Integer)
        // %.2f para Double com 2 casas decimais (Pode ser outro valor)
        
        String frase = String.format("Meu nome é %s, tenho %d de idade, e %.2f de altura. O nome do meu pet é %s"
                        , nome, idade, altura, "Frederico");
     
        System.out.println(frase);
    }
}
