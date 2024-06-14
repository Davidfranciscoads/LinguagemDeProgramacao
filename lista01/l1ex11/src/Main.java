//11. Entrar com o valor de temperatura em graus Celsius e exibir a
// temperaturacorrespondente em graus Fahrenheit.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double glausCelcius,fahrenheit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor em graus celcius ");
        glausCelcius = scanner.nextDouble();
        fahrenheit = glausCelcius * 1.8 + 32.0;
        System.out.println("o valor convertido em fahrenheit é " + fahrenheit);
    }
}