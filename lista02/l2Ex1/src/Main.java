//1. Receba um número real e caso ele seja positivo imprima sua raiz quadrada,
//caso contrário imprima a mensagem: “Valor inválido!”
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double numero,raizQuadrada;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        numero = scanner.nextDouble();

        // Verifica se o número é positivo
        if (numero >= 0) {
            // Calcula a raiz quadrada
            raizQuadrada = Math.sqrt(numero);
            // Imprime o resultado
            System.out.printf("A raiz quadrada do numero inserido é " +  raizQuadrada);
        } else {
            // Imprime mensagem de valor inválido
            System.out.println("Valor inválido!");
        }
    }
}