//14. Receber a base e a altura de um triângulo retângulo e calcular sua área
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double base,altura,area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero para a base do triagulo retangulo ");
        base = scanner.nextDouble();
        System.out.println("agora digite um numero para altura do triangulo retangulo");
        altura = scanner.nextDouble();
        area = base * altura / 2.0;
        System.out.println("o valor da area do triangulo retangulo é  " + area);
    }
}