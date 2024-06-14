//17 Receber velocidade inicial, aceleração e tempo de percurso de um corpo e
// calcular suavelocidade
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double velocidadeInicial,aceleracao,tempo,velocidadeFinal;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade inicial em metros por segundo");
        velocidadeInicial = scanner.nextDouble();
        System.out.print("Digite a aceleração em metros por segundo");
        aceleracao = scanner.nextDouble();
        System.out.print("Digite o tempo de percurso em segundos ");
        tempo = scanner.nextDouble();
        velocidadeFinal = velocidadeInicial + (aceleracao * tempo);
        System.out.println("A velocidade final é: " + velocidadeFinal + " m/s");

    }
}