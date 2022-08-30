
package ListaExercicios1;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class BolsaFilhos {
    public static void main(String[] args) {
             Scanner leitor = new Scanner(System.in);
        
        System.out.println("______________________________________________");
        System.out.println("Bem vindo ao Bolsa Filhos!!");
        System.out.println("______________________________________________");
        
        System.out.println("Quantos filhos de 0 a 3 anos você possui:");
        Integer filhos1 = leitor.nextInt(); 
        
        System.out.println("Quantos filhos de 4 a 16 anos você possui:");
        Integer filhos2 = leitor.nextInt(); 
        
        System.out.println("Quantos filhos de 17 a 18 anos você possui:");
        Integer filhos3 = leitor.nextInt(); 
        
        double m4 = 25.12;
        double e416 = 15.88;
        double e1718 = 12.44;
        
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        
        if (filhos1 > 1 ){
            valor1 = filhos1 * m4; 
        }
        if(filhos2 > 1){
            valor2 = filhos2 * e416;
        }
        if(filhos3 > 1){
            valor3 = filhos3 * e1718;
        }
        
        Integer totalFilhos = filhos1 + filhos2 + filhos3;
        
        Double totalAuxilio = valor1 + valor2 + valor3;
        System.out.println("______________________________________________");
        System.out.println("Você tem um total de: "+totalFilhos + " filhos e"
                + " vai receber R$ "+totalAuxilio+" de bolsa");
        
        
       
        
        
        }
        
    }
    
}
