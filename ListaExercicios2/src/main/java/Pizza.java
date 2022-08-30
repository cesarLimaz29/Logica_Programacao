
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class Pizza {
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
        Integer  Queijos = 0 ;
        Integer  Calabresa = 0 ;
        Integer  Mussarela = 0 ;
        
        for (int i = 0; i < 10; i++) {
            System.out.println
        ("Digite o numero do sabor ( lembrando que 5 para mussarela, 25 para calabresa e 50 para 4 queijos )");
        Integer sabor = leitor.nextInt();
   
        if (sabor  == 5 ){

            Mussarela = sabor   ;
        }
        else if(sabor == 25){

            Calabresa = sabor;
        }
        else if(sabor == 50){
 
            Queijos = sabor;
        }
        
        }
        
                if (Mussarela > Calabresa && Mussarela > Queijos){
            System.out.println("Mussarela é a favorita");
            Integer quant = 10 / Mussarela ;
            System.out.println("Quantidade de votos: " +quant );
         
        }
        
        else if (Calabresa> Mussarela && Calabresa > Queijos){
            System.out.println("Calabresa é a favorita");
            Integer quant1 =   10 / Calabresa;
            System.out.println("Quantidade de votos: " +quant1 );
        }
        
        else{
            System.out.println("4 Quijos é a favorita");
            Integer quant2 =   10 / Queijos;
            System.out.println("Quantidade de votos: " +quant2 );
        }
     
        
    }
}
