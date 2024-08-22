public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        // em arrays, o índice começa no 0, por isso a variável x começa = 0.
        
        for (int x = 0; x<alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        // for/each
        for (String aluno : alunos){
            System.out.println("Nome do aluno: " + aluno);
        }

    }
}
