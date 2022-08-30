import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class TesteDesconto {
        public static void main(String[] args) {
        DescontoProgressivo desconto = new DescontoProgressivo();
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de desconto progressivo!");

        System.out.println("Digite o valor unitário do produto:");
        
        Double valorUnitario = leitor.nextDouble();

        System.out.println("Digite a quantidade:");
        
        Double quantidadeProduto = leitor.nextDouble();

        desconto.Desconto(valorUnitario, quantidadeProduto);

        desconto.NotaFiscal(valorUnitario, quantidadeProduto);
    }
}

