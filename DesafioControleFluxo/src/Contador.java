import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); 
        int parametro1 = terminal.nextInt();
        int parametro2 = terminal.nextInt();

    try {
        contar (parametro1, parametro2);
    } catch (ParametrosInvalidosException e) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        int contagem = parametro2 - parametro1; 
        if (contagem <= 0){
            throw new ParametrosInvalidosException();
        } 
        for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }
}
