
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao Banco Futuro");
        System.out.println("Para abrir uma conta, digite o seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da sua conta: ");
        int conta = scanner.nextInt();
        System.out.println("Qual o valor do déposito inicial? ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + agencia + " e o número da sua conta é " + conta + ". O seu saldo R$" + saldo + " já está disponível para saque.");


    }
}
