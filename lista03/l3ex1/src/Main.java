// 1. Criar um programa que receba um valor do usuário e exiba a sua
// tabuada multiplicandoo número digitado pela sequência de 0 a 10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero,resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a sua tabuada: ");
        numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }


    }
}
