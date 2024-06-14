//5. Elabore um programa que calcule a média de um aluno e imprima o
// conceito: A se a média >= 8.5• B se a média >= 7 e média < 8.5• C se a média >= 5
// e média < 7• D se a média < 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1, nota2, mediaFinal;
        System.out.print("Insira sua primeira nota: ");
        Scanner entrada1 = new Scanner(System.in);
        nota1 = entrada1.nextDouble();
        System.out.print("Agora, insira sua segunda nota: ");
        Scanner entrada2 = new Scanner(System.in);
        nota2 = entrada2.nextDouble();
        mediaFinal = (nota1 + nota2) / 2;

        if (mediaFinal >= 8.5) {
            System.out.println("Sua média é A.");
        } else if (mediaFinal >= 7) {
            System.out.println("Sua média é B.");
        } else if (mediaFinal >= 5) {
            System.out.println("Sua média é C.");
        } else if (mediaFinal < 5) {
            System.out.println("Sua média é D.");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}