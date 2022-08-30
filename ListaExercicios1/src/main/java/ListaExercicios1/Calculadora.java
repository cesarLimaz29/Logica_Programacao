
package ListaExercicios1;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("______________________________________________");
        System.out.println("Bem vindo a Calculadora !!");
        System.out.println("______________________________________________");
        
        System.out.println("Digite o primeiro numero para fazer contas");
        double numero1 = leitor.nextDouble();
        
        System.out.println("Digite o segundo nimero para fazer contas ");
        double numero2 = leitor.nextDouble();
        
        double soma = numero1 + numero2;
        
        double subtracao = numero1 - numero2;
        
        double multiplicacao = numero1 * numero2;
        
        double divisao = numero1 / numero2;
        
        System.out.println("Resultado da soma: " +soma);
        
        System.out.println("Resultado da subtracao: " +subtracao);
        
        System.out.println("Resultado da multiplicacao: " +multiplicacao);
        
        System.out.println("Resultado da soma: " +divisao);
    }
}
