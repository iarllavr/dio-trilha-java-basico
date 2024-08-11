public class Operadores {
    public static void main(String[] args) {
        int numero = 3;
        System.out.println(++numero);
        System.out.println(numero);

        boolean aberto = true;
        System.out.println(aberto);
        System.out.println(!aberto);

        int a, b;
        a = 6;
        b = 6;
        int resultado = a == b ? 1 : 0;
        System.out.println("O resultado é: " + resultado);

        String nomeUm = "IARLLA";
        String nomeDois = new String ("IARLLA");
        
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois)); // no caso de Strings(conteúdos), para comparar igualdade é necessário utilizar o método equals pois o sistema armazena os valores de forma diferente dos valores numéricos.

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
        if (numero1 < numero2){
            System.out.println("A nossa condição é verdadeira.");
        }

        if (numero1 == numero2){
            System.out.println("A nossa condição é verdadeira.");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);


    }
}
