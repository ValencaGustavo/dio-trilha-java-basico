public class ExemploForArray {
    public static void main(String[] args) {

        // Em arrays o indice inicia em ZERO
        String alunos [] = { "Felipe", "Jonas", "Julia", "Marcos" };

        // for (int x=0; x < alunos.length; x++) {
           // System.out.println("O aluno no indice x= " + x + " é " + alunos [ x ]);
       // }

       for(String aluno : alunos) {
        System.out.println("O aluno no indice x = " + aluno );
       }
    }
}
