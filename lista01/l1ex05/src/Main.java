//5. Ler uma velocidade em Km/h e converter para m/s.

//import java.util.Scanner; significa que o programa esta importando a classe scanner
// que no caso serve como um imput para o usuario digita
import java.util.Scanner;

//indica que essa classe utiliza um metodo publico e pode ser acessada por
//outras classes
public class Main {
    public static void main(String[] args) {

        double quilometros, metros; // Declara variáveis

        Scanner scanner = new Scanner(System.in); // Cria Scanner para entrada
        System.out.println("Digite uma velocidade em km/h:"); // Solicita entrada
        quilometros = scanner.nextDouble(); // Lê entrada do usuário
        metros = quilometros / 3.6; // Converte km/h para m/s
        System.out.println("O valor em metros por segundo é: " + metros); // Exibe resultado

    }
}

