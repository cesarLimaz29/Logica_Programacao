
package ListaExercicios1;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class CadastroUsuario {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("______________________________________________");
        System.out.println("Bem vindo ao cadastro de usuarios!!");
        System.out.println("______________________________________________");
        
        System.out.println("Insira o seu login: ");
        String nome = leitor.nextLine();
        
        System.out.println("Insira a sua senha: ");
        String senha = leitor.nextLine();
        
        System.out.println("Insira as tentativas maximas de acesso antes de ser"
                + " bloqueado: ");
        Integer tentativas = leitor.nextInt();
        
        System.out.println("O seu login de usuario é: " +nome
                + "\nA sua senha de acesso é: " +senha
                + "\n O maximo de tentativas é: "+tentativas
        );
        
        
        
        
    }
        
}
