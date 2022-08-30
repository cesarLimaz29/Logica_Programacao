/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class VerificarPrimo {
    
        void verificar(Integer numero) {
        Integer divisor = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisor += 1;
            }
        }

        if (divisor == 2) {
            System.out.println("O número é primo!");
        } 
        
        else {
            System.out.println("O número não é primo!");
        }
    }
}
