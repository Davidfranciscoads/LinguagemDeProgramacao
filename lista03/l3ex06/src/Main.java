//6. Peça para o usuário inserir dois números inteiros e exiba todos os números
// existentes entre os números digitados

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        number1 = in.nextInt();

        System.out.println(" Digite o segundo número inteiro:");
        number2 = in.nextInt();

        System.out.println(" Números do intervalo:");

        if(number1 > number2) {
            int aux = number1;
            number1 = number2;
            number2 = aux;
        }

        for (int i=number1+1; i<number2; i++){
            System.out.println(i);
        }

    }
}
