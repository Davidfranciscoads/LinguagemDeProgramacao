//10. Ler uma medida de distância em milhas e converter para quilômetros.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                double velocidadeInicial,aceleracao,velocidadeFinal,tempo;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a velocidade inicial (em m/s): ");
                velocidadeInicial = scanner.nextDouble();
                System.out.print("Digite a aceleração (em m/s^2): ");
                aceleracao = scanner.nextDouble();
                System.out.print("Digite o tempo de percurso (em segundos): ");
                tempo = scanner.nextDouble();
                velocidadeFinal = velocidadeInicial + (aceleracao * tempo);
                System.out.println("A velocidade final é: " + velocidadeFinal + " m/s");

            }
        }


