//3. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média.
// Se a média for menor que 50 imprimir “Reprovado” caso contrário imprimir “Aprovado”
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double media1,media2,mediaComp,mediaFinal;
        System.out.print("Informe a primeira nota: ");
        Scanner n1 = new Scanner(System.in);
        media1 = n1.nextDouble();
        System.out.print("Informe a segunda nota: ");
        Scanner n2 = new Scanner(System.in);
        media2 = n2.nextDouble();
        mediaComp = media1 + media2;
        mediaFinal = mediaComp /2;

        System.out.print("A média entre as notas informadas é: "+mediaFinal+" - ");

        if (mediaFinal > 50){

            System.out.print("APROVADO");

        }

        else {
            System.out.print("REPROVADO!");
        }

    }
}