//8. O usuário entra com um número inteiro e o programa indica se o número é
// ímpar ou par

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double resultado;
        System.out.println("Digite um número: ");
        Scanner n1 = new Scanner(System.in);
        resultado = n1.nextDouble();

        if(resultado % 2 == 0){

            System.out.print("O número " +resultado+ " é um número par.");

        }

        else if (resultado % 2 == 1){

            System.out.print("O número " +resultado+ " é ímpar");

        }
    }
}