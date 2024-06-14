//2. Ler um número inteiro e exibir o seu quadrado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero,resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = scanner.nextInt();
        resultado = numero * numero;
        System.out.println("O quadrado do numero digitado é: " + resultado);
    }
}