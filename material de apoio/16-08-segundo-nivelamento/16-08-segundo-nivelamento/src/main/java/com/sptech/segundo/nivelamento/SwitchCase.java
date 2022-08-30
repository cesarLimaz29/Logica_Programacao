package com.sptech.segundo.nivelamento;

import java.util.Scanner;

/**
 *
 * @author miniguiti
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um dia da semana: ");
        Integer dia = leitor.nextInt();
        
        // Também é possível fazer com String
        // Sem o break passa pelos outros cases
        switch(dia){
            case 1:
                System.out.println("Segundou!");
                //Aqui também poderia ter um código complexo e grande
                break;
            case 2:
                System.out.println("Terçou");
                break;
            case 3:
                System.out.println("Quartou!");
                break;
            case 4: 
               System.out.println("Quintou!");
               break;
            case 5:
                System.out.println("Sextou :)");
                break;
            //Padrão, cai aqui se não entrou em nenhum case
            default: 
                System.out.println("Número Inválido! :(");
                break;
        }
    }
}
