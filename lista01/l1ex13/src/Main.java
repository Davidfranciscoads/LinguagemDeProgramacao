//13.  Receber o raio e um círculo e calcular sua área
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double raio,area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        raio = scanner.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é" + area);

            }
        }
