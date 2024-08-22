public class ExemploFor {
    public static void main(String[] args) {
        // for (bloco de inicialização; expressão boleana de validação; bloco de atualização)
        // {comando que será executado até a expressão de validação tornar-se falsa}
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando carneirinhos... " + carneirinhos);
        }
        System.out.println("Joãozinho dormiu.");
    }
}