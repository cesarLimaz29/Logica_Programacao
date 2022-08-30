
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class Autenticate {
    public static void main(String[] args) {
         Scanner leitor = new Scanner (System.in);
         
         String login1 = "admin";
         
         String senha1 = "#Bandtec";
         
         System.out.println("Digite o Login");
         String login = leitor.nextLine();
         
         System.out.println("Digite a senha");
         String senha = leitor.nextLine();
         
         if(login.equals(login1) && senha.equals(senha1)){
           
             System.out.println("Login realizado com sucesso");
         }
         else{
             System.out.println("Login e/ou senha invÃ¡lidos");
         }
    }
    
}
