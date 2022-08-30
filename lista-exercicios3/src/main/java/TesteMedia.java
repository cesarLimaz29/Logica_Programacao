
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class TesteMedia {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        CalcularMedia media = new CalcularMedia();
        
        double numero1 = 0;
        double numero2 = 0;
        
        System.out.println("Digite o 1º numero ");
        numero1 = leitor.nextDouble();
        
        System.out.println("Digite o 2º numero ");
        numero2 = leitor.nextDouble();
        
        double numdigitado = media.media(numero1,numero2);
        System.out.println(numdigitado);
    }
    
}
