
package ListaExercicios1;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("______________________________________________");
        System.out.println("Bem vindo ao aplicativo do elevador  !!");
        System.out.println("______________________________________________");
        
        System.out.println("Digite o limete de peso do elevador");
        double peso = leitor.nextDouble();
        
        System.out.println("Digite o limite de pessoas do elevador");
        Integer lotacao = leitor.nextInt();
        
        System.out.println("Digite o peso da pessoa 1 ª pessoa");
        double peso1 = leitor.nextDouble();
        
        System.out.println("Digite o peso da pessoa 2 ª pessoa");
        double peso2 = leitor.nextDouble();
        
        System.out.println("Digite o peso da pessoa 3 ª pessoa");
        double peso3 = leitor.nextDouble();
        
        double pesoTotal = peso1+peso2+peso3;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "
                +lotacao+" pessoas. O peso total no elevador é de "+ pesoTotal
                + "sendo que ele suporta "+peso);
    }
    
}
