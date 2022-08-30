package com.sptech.metodos;

/**
 *
 * @author miniguiti
 */

// Não precisa de main!
// Vamos usar ela em uma classe que possui main
public class Utilitaria {

    // A assinatura do método possui;
    // Retorno: void, esse não retorna nada
    // Nome do método: exibirLinha
    // Argumentos: dentro dos (), esse não possui nenhum
    // Corpo: tudo que tem dentro das {}
    
    void exibirLinha(){
        System.out.println("*------------------------*");
    }
    
    
    // Método que recebe um argumento:
    void exibirNome(String nomeUsuario){
        System.out.println(String.format("Nome: %s", nomeUsuario));
    }
    
    // Podemos chamar métodos em métodos!
    void exibirNomeDecorado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
    
    // Ao criar métodos, centralizamos a lógica em um lugar só
    // e utilizamos quantas vezes precisar
    // Se mudar muda em um lugar só, logo ajuda na manutenção :)
    
}
