
/**
 *
 * @author cesar
 */
public class DescontoProgressivo {
        Double vFinal;

    Double Desconto(Double valor, Double quantidade) {

        if (quantidade == 1) {
            vFinal = (valor - (valor * 10 / 100)) * quantidade;
        } else if (quantidade == 2) {
            vFinal = (valor - (valor * 20 / 100)) * quantidade;
        } else {
            vFinal = (valor - (valor * 30 / 100)) * quantidade;
        }

        return vFinal;
    }

    void NotaFiscal(Double valor, Double quantidade) {
        System.out.println("-----------x--------------");
        System.out.println(String.format("Valor do produto: R$%.2f", valor));
        System.out.println(String.format("Quantidade: %.0f", quantidade));
        System.out.println("-----------x--------------");

        System.out.println(String.format("Valor com desconto: R$%.2f", vFinal));
    }
}

