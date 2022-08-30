
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class Sorteio {
       public static void main(String[] args) {
         Scanner leitor =  new Scanner(System.in);
        
          System.out.println("Digite um numero");
          Integer valor = leitor.nextInt();
          
          Integer contador = 1;
          
          for (int i = 0; i<=200 ; i++) {
              Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 200);
           
                 
            if(valor == numeroAleatorio && i == 1){
                System.out.println(i + "° Seu numero foi sorteado de primeira " + numeroAleatorio + "******");
                

         
            }else{
                if(numeroAleatorio % 2 == 1 ){
                System.out.println(i + "° Numeros impares sorteados "+ numeroAleatorio );
                
            }
                if(numeroAleatorio % 2 == 0){
                System.out.println( i + "° Numeros pares sorteados " + numeroAleatorio);
                }
                if(valor == numeroAleatorio ){
                System.out.println(i + "° ***** Seu numero foi sorteado  " + numeroAleatorio + "******");
                }
                 
            }
        
        } 
    }
}
