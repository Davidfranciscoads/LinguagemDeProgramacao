//8. Ler uma medida em polegadas e converter para milímetros.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double polegadas,milimetros;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor em polegadas");
        polegadas = scanner.nextDouble();
        milimetros = polegadas * 25.4;
        System.out.println("o valor convertido em milimetros é " + milimetros);
    }
}