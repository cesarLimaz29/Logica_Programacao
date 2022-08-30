package com.sptech.primeiro.nivelamento;

/**
 *
 * @author miniguiti
 */
public class Condicionais {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;
        
        // > maior
        // < menor
        // <= menor igual
        // >= maior igual
        // != diferente
        // ! negação
        // == igual
        // || ou
        // && e
        // .equals para string obrigatóriamente
        
        
        //Se fosse Double, a mesma coisa
        if(numero01 > numero02){
            System.out.println(numero01 + " é maior que " + numero02);
        }else if(numero01 < numero02){
            System.out.println(numero01 + " é menor que " + numero02);
        }else if(numero01 == numero02){ // aqui poderia ser só else
            System.out.println(numero01 + " é igual " + numero02);
        }
        
        //Condicional com Boolean
        
        //Cuidado ao nomear boleano
        // Imagina se fosse bloqueadoOuNao ? x_x
        
        Boolean isBloqueado = true; //valor vem do BD
        
        if(isBloqueado){
            System.out.println("Usuário bloqueado");
        }else{
            System.out.println("Usuário desbloqueado");
        }
        
        String nome01 = "João";
        String nome02 = "joão"; 
        
        //Para String SEMPRE usamos .equals
        
        //SENsitive case
        if(nome01.equals(nome02)){
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!");
        }
        
        //INSENsitive case
        if(nome01.equalsIgnoreCase(nome02)){
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!");
        }
                
    }
}
