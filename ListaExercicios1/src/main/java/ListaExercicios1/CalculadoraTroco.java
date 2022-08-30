
package ListaExercicios1;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class CalculadoraTroco {
    public static void main(String[] args) {
 
     Scanner leitor = new Scanner(System.in);
     
        System.out.println("______________________________________________");
        System.out.println("Bem vindo a Calculadora de Troco !!");
        System.out.println("______________________________________________");
    
        System.out.println("Digite o valor unitario de um produto");
        double preco = leitor.nextDouble();
        
        System.out.println("Digite a quantidade vendida do produto");
        double qtdProduto = leitor.nextDouble();
        
        System.out.println("Digite o valor que o cliente pagou");
        double valor = leitor.nextDouble();
        
        double total = 0;
        double troco = 0;
        
        total = preco * qtdProduto;
        
        troco = valor - total;
        
        System.out.println("Seu troco será de R$ "+troco );
        
        
    }
       
}