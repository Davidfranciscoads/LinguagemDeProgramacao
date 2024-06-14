//15. Receber o raio e a altura de um cilindro e calcular seu volume.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double raio,altura,volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor para o raio");
        raio = scanner.nextDouble();
        System.out.println("agora digite o valor da aultura ");
        altura = scanner.nextDouble();
        volume = Math.PI * raio * raio * altura;
        System.out.println("o valor do volume do cilindro é " + volume);
    }
}