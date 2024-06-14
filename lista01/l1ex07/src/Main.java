//7. Ler uma medida em milímetro e converter para polegadas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double milimetros,polegadas;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor em milimetro");
        milimetros = scanner.nextDouble();
        polegadas = milimetros / 25.4;
        System.out.println("o valor convertido em polegadas é " + polegadas);
    }
}