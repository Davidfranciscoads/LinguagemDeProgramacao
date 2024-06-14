//16. Receber o raio e a altura de um cone e calcular seu volume
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double raio,altura,volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor do raio ");
        raio = scanner.nextDouble();
        System.out.println("digite o valor da altura");
        altura = scanner.nextDouble();
        volume = raio * altura / 3.0;
        System.out.println("o valor do volume do cone é " + volume);
    }
}