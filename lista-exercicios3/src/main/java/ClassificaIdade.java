
/**
 *
 * @author cesar
 */
public class ClassificaIdade {
           void calcularFaixa(Integer ida) {
               
        if (ida > 60) {
            System.out.println("Idoso");
        } 
        else if (ida > 31) {
            System.out.println("Adulto");
        } 
        else if (ida > 20) {
            System.out.println("Jovem");
        } 
        else if (ida > 12) {
            System.out.println("Adolescente");
        } 
        else if (ida > 3) {
            System.out.println("Criança");
        } 
        else {
            System.out.println("Bebê");
        }
    }
}
