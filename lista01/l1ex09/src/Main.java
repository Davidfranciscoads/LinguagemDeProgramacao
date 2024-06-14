//9. Ler uma medida de distância em quilômetros e converter para milhas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double quilometros,milhas;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor ");
        quilometros = scanner.nextDouble();
        milhas = quilometros * 0.621371;
        System.out.println("o valor convertido em milhas é " + milhas);
    }
}