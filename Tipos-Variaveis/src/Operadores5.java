// == | IGUAL
// != | DIFERENTE
// > | MAIOR QUE
// >= | MAIOR OU IGUAL
// < | MENOR QUE
// <= MENOR OU IGUAL

public class Operadores5 {
    public static void main(String[] args) {

        String nomeUm = "Gustavo";
        String nomeDois = new String ("Gustavo");

        System.out.println(nomeUm.equals(nomeDois));

        // System.out.println(nomeUm == nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        // if(numero1 == numero2) {
            // System.out.println("A nossa condição é verdadeira");
       // }

        if(numero1 == numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual à numeroDois? " +simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois? " +simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " +simNao);

        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior ou igual ao numeroDois? " +simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor que numeroDois? " +simNao);

        simNao = numero1 <= numero2;

        System.out.println("numeroUm é menor ou igual ao numeroDois? " +simNao);


    }
    
}
