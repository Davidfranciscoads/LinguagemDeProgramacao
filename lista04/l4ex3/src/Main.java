//3. Crie um programa que contenha um vetor de inteiros de 10 posições
// (inicializar o vetorjunto com sua declaração). O programa deve solicitar ao usuário
// um número inteiro(armazenar em uma variável comum inteira) e então realizar uma busca
// dentro do vetor.Caso a variável digitada exista dentro do vetor, exibir sua posição
// no vetor caso contrário exibir a mensagem “ Valor não encontrado".
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vector = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value;
        boolean not_found = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        value = in.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == value) {
                System.out.println("Valor " + value + " encontrado na posição " + i);
                not_found = false;
                break;
            }
        }
        if (not_found)
            System.out.println("Valor não encontrado!");

    }
}