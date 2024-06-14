//12. Ler duas notas N1 e N2 e exibir a média. Obs.: N1 tem peso 1 e N2 tem peso 2 e
// resultadodeve estar entre 0 e 10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1,n2,valorDaMedia;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota N1 (peso 1): ");
        n1 = scanner.nextDouble();
        System.out.print("Digite a nota N2 (peso 2): ");
        n2 = scanner.nextDouble();
        valorDaMedia = (n1 + 2 * n2) / 3;
        System.out.printf("o valor da media é " + valorDaMedia);

            }
        }
