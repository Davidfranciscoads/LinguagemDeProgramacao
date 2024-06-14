//3. Ler um número real e exibir a quinta parte deste número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double resultado,numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero e veja a sua quinta parte ");

        //aqui ele faz a leitura do numero digitado pelo usuario
        numero = scanner.nextDouble();

        //formula que foi usada para fazer o calculo
        resultado = numero / 5.0;
        System.out.println("a quinta parte é igual = " + resultado);
    }
}
