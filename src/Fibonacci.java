import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        // definir variaveis
      int  primeiroTermo = 0;
      int segundoTermo = 1;
      int auxiliar = 0, n;

      // solicitar um numero ao usuario
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero positivo");
        n = input.nextInt();

        //Testando e validando

        while (auxiliar< n){
            auxiliar = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = auxiliar;
        }

        if (auxiliar == n){
            System.out.println("Pertence a Sequencia Fibonacci");
        }else {
            System.out.println("Não Pertence a Sequencia Fibonacci");
        }
    }
}
