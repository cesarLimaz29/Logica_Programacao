
package ListaExercicios1;
import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class NovoShape {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("_________________________________________________");
        System.out.println("Em busca do Shape Perfeito");
        System.out.println("_________________________________________________");
        
        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();
        
        System.out.println("Quantos minutos você aqueceu?");
        Integer aquecimento = leitor.nextInt();
        
        System.out.println("Quantos minutos você fez exercicios aeróbicos"
                + " (correr, andar, pedalar, etc...)");
        Integer cardio = leitor.nextInt();
        
        System.out.println("Quantos minutos você fez musculação?");
        Integer musculacao = leitor.nextInt();
       
       
        Integer    tCalorias1 = 0;
        Integer    tCalorias2 = 0;
        Integer    tCalorias3 = 0;
        
        if (aquecimento > 1 ){
            tCalorias1 = aquecimento * 12; 
        }
        if(cardio > 1){
            tCalorias2 = cardio * 20;
        }
        if(musculacao > 1){
            tCalorias3 = musculacao * 25;
        }
        Integer totalCalorias = tCalorias1 + tCalorias2 + tCalorias3;
        Integer totalMinutos = aquecimento + cardio + musculacao;
        System.out.println("Olá," + nome + "Você fez um total de" +totalMinutos+ " minutos de exercícios e perdeu cerca de " +totalCalorias+  " calorias");
    }
}
