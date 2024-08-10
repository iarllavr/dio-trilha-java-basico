public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou o salário de um funcionário?
        int idade; // tipo "int", nome "idade", com nenhum valor atribuído(0 por padrão)
        int anoFabricacao = 2024; // tipo "int", nome "anoFabricacao", com valor 2024 atribuído
        double salarioMinimo = 2500.33; // tipo "double", nome "salarioMinimo". com valor 2500,33 atribuído
        // Pontos de atenção
        byte idade2 = 123;
        short ano = 2024;
        int cep = 45570000; // se começar com 0, talvez tenha que ser outro tipo (o java não armazenaria como tipo inteiro, teria que ser como string)
        long cpf = 98765432109L; // tipo long deve ter L no final para representar que não é inteiro, que é long. se começar com 0, talvez tenha que ser outro tipo (o java não armazenaria como tipo inteiro, teria que ser como string)
        float pi = 3.14F; // tipo float deve ter F no final, caso contrário vai dar erro pois o java poderá identificar como double
        double salario = 1275.33;

        // Fortemente Tipado
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // CASTING!

        // Constantes e varíaveis
        int numero = 5;
        numero = 10;

        System.out.println(numero);

        // double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 3.15
        final double VALOR_DE_PI = 3.14; // a caixa alta no nome é por convenção, mas o que realmente define como constante é o "final" no começo
        // double VALOR_DE_PI = 3.15;

        //tipos primitivos
        //classe Spring que representa texto na aplicação
        String meuNome = "Iarlla Vieira";

    }

}
