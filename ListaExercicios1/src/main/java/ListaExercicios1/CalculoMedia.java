
package ListaExercicios1;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class CalculoMedia {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("______________________________________________");
        System.out.println("Bem vindo ao Calculador de média  !!");
        System.out.println("______________________________________________");
        
        System.out.println("Digite o nome usuario");
        String nome = leitor.nextLine();
        
        System.out.println("Entre com a primeira nota");
        double nota1 = leitor.nextDouble();
    
        System.out.println("Entre com a segunda nota");
        double nota2 = leitor.nextDouble();
        
        double media = nota1 + nota2 / 2;
        
        System.out.println("Olá, "+nome+". Sua média foi de:" + media);
    }
}
