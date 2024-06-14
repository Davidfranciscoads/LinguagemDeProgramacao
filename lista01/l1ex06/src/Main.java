//6. Ler uma velocidade em m/s e converter para km/h.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double velocidadeMs,velocidadeKmh ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma velocidade em metros por segundo");
        velocidadeMs = scanner.nextDouble();
        velocidadeKmh  = velocidadeMs * 3.6;
        System.out.println("o valor em quilometros por hora é " + velocidadeKmh );
    }
}