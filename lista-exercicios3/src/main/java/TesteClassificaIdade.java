
import java.util.Scanner;


/**
 *
 * @author cesar
 */
public class TesteClassificaIdade {
        public static void main(String[] args) {
        ClassificaIdade ClassIdd = new ClassificaIdade();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        Integer idade = leitor.nextInt();

        ClassIdd.calcularFaixa(idade);
    }
    
}
