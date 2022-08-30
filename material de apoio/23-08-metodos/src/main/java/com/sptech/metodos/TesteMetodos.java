package com.sptech.metodos;

import java.util.Scanner;

public class TesteMetodos {
    public static void main(String[] args) {
                
        //Instânciando a classe Utilitaria
        //Criando um objeto
        Utilitaria util = new Utilitaria();
        
        //Invocando um método (chamando)
        util.exibirLinha();
        
        String nome = "Giuliana";
        
        // Posso passar uma variável com nome diferente do argumento 
        // O que importa é passar o mesmo tipo!
        util.exibirNome(nome);        
        util.exibirNome("Maria");
        
        System.out.println("Exibindo nome decorado: ");
        util.exibirNomeDecorado("Giuliana");
        
        System.out.println("---> Testando Cálculadora <---");
        
        // Criando um objeto do tipo Calculadora
        Calculadora calc = new Calculadora();
        
        //Agora precisamos usar o retorno do método!
        Double soma = calc.somar();
        System.out.println(soma);
        
        //Desafio: implemente um Scanner
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite os números");
        Double numeroDigitado1 = leitor.nextDouble();
        Double numeroDigitado2 = leitor.nextDouble();
        
        //Guardando retorno em variável do mesmo tipo!
        Double resultado = calc.somar(numeroDigitado1, numeroDigitado2);
        
        System.out.println("Retorno da soma (resultado): " + resultado);        
                
        Boolean isPar = calc.isNumeroPar(resultado);
        
        if(isPar){ //Poderia chamar o método direto aqui
            System.out.println("É par!");
        }else{
            System.out.println("Não é par!");           
        }
        
    }
}
