package candidaturas.src;
import java.util.Random;

public class TentativaContato {
     public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato: candidatos){
            entrarEmContato(candidato);
        }
     }

     static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();    
            continuarTentando = !atendeu;
            if (continuarTentando){
               tentativasRealizadas++;
            } else {
               System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while(continuarTentando && tentativasRealizadas<3);
        if (atendeu){
         System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
        } else {
         System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS: " + tentativasRealizadas);
        }
     }

     static boolean atender(){
        return new Random().nextInt(3)==1;
     }

}
