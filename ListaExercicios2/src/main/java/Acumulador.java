
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
            
            Integer numero;
            Integer acumulador = 0; 
            
            do{
                System.out.println("Digite um numero: ");
                numero = leitor.nextInt();
            
                acumulador = acumulador +numero;
            }while(numero > 0);
            System.out.println("Total acumulado é: " +acumulador);
    }
}
