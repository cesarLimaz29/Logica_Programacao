
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class TesteClassesSociais {
     public static void main(String[] args) {
        ClassesSociais classe = new ClassesSociais();
        Scanner leitor = new Scanner(System.in);

        String classeSocial;

        System.out.println("Digite o valor da sua renda mensal:");
        Double rendaM = leitor.nextDouble();

        Double salario = classe.calculoSalario(rendaM);

        System.out.println(String.format("Você ganha aproximadamente %.2f salários mínimos.", salario));

        if (salario > 20) {
            classeSocial = "A";
        }
        else if (salario > 10) {
            classeSocial = "B";
        }
        else if (salario > 4) {
            classeSocial = "C";
        }
        else if (salario > 2) {
            classeSocial = "D";
        } else {
            classeSocial = "E";
        }

        System.out.println(String.format("Pertence a classe social: %s.", classeSocial));
    }
}
