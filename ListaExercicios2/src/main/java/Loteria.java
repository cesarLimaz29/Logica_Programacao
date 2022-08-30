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
public class Loteria {
     public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
       
        for (int i = 0; ; i++) {
            
        System.out.println("Digite um numero de 0 a 10");
        Integer aleatorio = leitor.nextInt();
        
        Integer numeroRand = ThreadLocalRandom.current().nextInt(0,11);    
        
            System.out.println(numeroRand);
            
        if (aleatorio == numeroRand && i <= 3){
            System.out.println("Você é muito sortudo!");
           
        }
        else if(aleatorio == numeroRand && i  >= 4 && i <= 10 ){
            System.out.println("Você é sortudo");
           
        }
        else if(aleatorio == numeroRand && i > 10 ){
            System.out.println("É melhor parar de apostar e ir trabalhar!!");
        } 
    } 
  }
}
