//4. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média.
// Se a médiafor maior ou igual a 50, exibir “Aprovado”, caso contrário solicitar ao usuário
// a nota daprova de recuperação, tirar nova média entre a média anterior e a
// prova de recuperação,se a nova média for menor que 50 exibir “Reprovado” caso contrário
// exibir “Aprovado

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double media1,media2,mediaFinal,mediaRecuperação,mediaDefinitiva;
        System.out.print("Informe sua primeira nota: ");
        Scanner n1 = new Scanner(System.in);
        media1 = n1.nextDouble();
        System.out.print("Informe sua segunda nota: ");
        Scanner n2 = new Scanner(System.in);
        media2 = n2.nextDouble();
        mediaFinal = (media1 + media2) /2;
        System.out.println("A média entre suas notas é: "+mediaFinal);
        if (mediaFinal > 50){
            System.out.print("APROVADO!");
        }

        else {
            System.out.print("Insira sua nota da prova de recuperação: ");
            Scanner mediaNova = new Scanner(System.in);
            mediaRecuperação = mediaNova.nextDouble();

            mediaDefinitiva = (mediaFinal+mediaRecuperação) /2;

            if (mediaDefinitiva > 50){
                System.out.println("APROVADO");
            }

            else {

                System.out.println("REPROVADO");

            }
        }

    }
}