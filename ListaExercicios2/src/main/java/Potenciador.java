/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class Potenciador {
        public static void main(String[] args) {
        Integer num = 2;
        
        Integer pot = 5;
        
        Integer resultado = 1;
        
        while (pot != 0) {
            resultado = resultado * num;
            
            pot--;
        }
        System.out.println("O resultado da potencia Ã© =  " + resultado);
    }
}
