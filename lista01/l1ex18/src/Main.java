//18. Receber os coeficientes a e b de uma equação do primeiro grau e imprimir a
// solução.Equação do primeiro grau: ax + b = 0
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o coeficiente a ");
        a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        b = scanner.nextDouble();
        x = -b / a;
        System.out.printf("A solução da equação é" + x);
    }
}