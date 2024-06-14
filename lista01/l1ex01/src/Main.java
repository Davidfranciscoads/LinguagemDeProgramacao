//1. Ler um número inteiro e exibir o seu dobro.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declaração de variaveis, aqui no caso estou declarando variaveis
        // do tipo inteiro
         int numero,resultado;

         //esse comando seria um input para o usuario onde ele pede pro usuario digitar
        // um valor do tipo inteiro, e nao pode ser uma palavra, caso o usuario digite algo
        // que nao esteja de acordo com a variavel que pede acima ele da uma falha
         Scanner scanner = new Scanner(System.in);

         // aqui nesse comando ele ira mostrar a menssagem que esta dentro do campo " "
         System.out.println("digite um numero inteiro ");

         //scanner.nextInt() indica estar recebendo um dado do tipo inteiro
         numero = scanner.nextInt();

         //aqui seria a maneira de como ele calcula essa operação
         resultado = numero * 2;

         // print final onde o mostra o valor ja calculado
          System.out.println("o dobro do numero digitado é " + resultado);

    }
}