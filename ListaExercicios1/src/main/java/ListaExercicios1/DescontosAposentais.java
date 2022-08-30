
package ListaExercicios1;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class DescontosAposentais {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("______________________________________________");
        System.out.println("Bem vindo ao aplicativo Aposentadoria  !!");
        System.out.println("______________________________________________");
        
        
        System.out.println("Digite o quanto é o salario bruto");
        double salarioBruto = leitor.nextDouble();
        
        System.out.println("Digite o valor do quanto voce gasta de condução"+
        " para ir de casa ao trabalho");
        double valetrans = leitor.nextDouble();
        
        double inss = salarioBruto * 10/100;
        
        double ir = salarioBruto * 20/100;
        
        double vt = valetrans * 2 * 22;
        
        double salarioLiquido = salarioBruto - inss - ir - vt;
        
        double descontos = inss + ir + vt;
        
       System.out.println("Seu salário bruto é R$"+salarioBruto
                +", tem um total de R$" + descontos 
                + " em descontos e receberá um líquido de R$"+ salarioLiquido);
       
        
    }
}
