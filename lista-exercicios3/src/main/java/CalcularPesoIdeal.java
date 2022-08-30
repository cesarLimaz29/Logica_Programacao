
/**
 *
 * @author cesar
 */
public class CalcularPesoIdeal {
        void calcularPeso(String sexo, Double altura) {
        Double pesoIdeal;

        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58.0;
            System.out.println(String.format("Seu peso ideal é: %.2f", pesoIdeal));
            
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println(String.format("Seu peso ideal é: %.2f", pesoIdeal));
        }
    }
}
