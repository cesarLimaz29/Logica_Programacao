package ListaExercicios1;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
  
        System.out.println("______________________________________________");
        System.out.println("Quantos anos você vai ter ??");
        System.out.println("______________________________________________");
        
        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();
        
        System.out.println("Olá " +nome+"! Qual o ano de seu nascimento?");
        Integer idade = leitor.nextInt();
        
        Integer anos = 2030 - idade;
        System.out.println("Em 2030 você terá "+ anos + " anos");
        
    }
}
