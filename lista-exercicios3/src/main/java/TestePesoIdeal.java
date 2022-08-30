import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class TestePesoIdeal {
     public static void main(String[] args) {
        CalcularPesoIdeal PesoIdeal = new CalcularPesoIdeal();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 'M' para masculino e 'F' para feminino:");
        String sexo = leitor.nextLine();

        System.out.println("Digite a sua altura:");
        Double altura = leitor.nextDouble();

        PesoIdeal.calcularPeso(sexo, altura);
    }
}
