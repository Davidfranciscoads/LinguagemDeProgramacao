// 8. Criar um programa onde o usuário entra com um número e o programa diz se
// o númerodigitado é primo ou não

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo maior que 1: ");
        int numero = scanner.nextInt();


        boolean ehPrimo = true;

        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {
            ehPrimo = false;
        } else {

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }


        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

    }
}

