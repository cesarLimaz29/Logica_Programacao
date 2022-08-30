package com.sptech.primeiro.nivelamento;

import java.util.Scanner;



/**
 *
 * @author miniguiti
 */
public class LeituraEscrita {
    public static void main(String[] args) {
       
        // Usamos Scanner para ler valores do console
        
        // Criando um objeto do tipo Scanner
        // Sempre que tem o new estamos INSTÂNCIANDO
        // INSTÂNCIANDO = criando um objeto
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);
       
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
                
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();
        
        // \n para quebrar linha
        // \t para dar um espaço (tab)
        System.out.println("Nome: " + nome
                + "\nIdade: " + idade 
                + "\nAltura: " + altura);
        
        
        // Usando o mesmo Scanner (leitor) não da certo!
        System.out.println("Palavra 01");
        String p1 = leitorNl.nextLine();
        
        System.out.println("Palavra 02");
        String p2 = leitorNl.nextLine();
        
        System.out.println("Palavras:");
        System.out.println(p1);
        System.out.println(p2);       
        
    }
}
