/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um numero");
        Integer numero = leitor.nextInt();
        
        for (int i = 0; i < 11; i++) {
            Integer calculo = numero * i;
            System.out.println(numero+ " x " + i + " = " +calculo);
        }
        
        
        
    }
    
}
