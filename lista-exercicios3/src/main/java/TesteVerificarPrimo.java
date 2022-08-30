
import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class TesteVerificarPrimo {
     public static void main(String[] args) {
        VerificarPrimo verificar = new VerificarPrimo();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro ");
        Integer numero = leitor.nextInt();

        verificar.verificar(numero);

        for (int i = 0; numero > -1; i++) {
            System.out.println("Digite um número inteiro ");
            numero = leitor.nextInt();

            verificar.verificar(numero);
        }
    }
}
