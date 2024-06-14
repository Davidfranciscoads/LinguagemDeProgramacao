//4. Ler duas notas N1 e N2 e exibir a média.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double nota01,nota02,media;

         Scanner scanner = new Scanner(System.in);
        System.out.println("insira a primeira nota");
         nota01 = scanner.nextDouble();
        System.out.println("insira a segunda nota");
         nota02 = scanner.nextDouble();
        media = (nota01 + nota02) / 2.0;
         System.out.println("a media dos resultados é " + media);
    }
}
