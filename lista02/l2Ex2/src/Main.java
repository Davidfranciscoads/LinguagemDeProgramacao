//2. o usuário entra com dois números inteiros e o programa indica qual o maior

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double primeiroNumero,segundoNumero;
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o primeiro número:");
        primeiroNumero = scan.nextDouble();
        System.out.print("Informe o segundo número:");
        segundoNumero = scan.nextDouble();

        //verifica se o numero é maior que o segundo digitado
        if (primeiroNumero > segundoNumero){
            System.out.print("O numero " + primeiroNumero + " é maior que "+ segundoNumero);
        }
        //aqui ele mostra caso contrario sobre a função do if
        else if (segundoNumero > primeiroNumero){
            System.out.print("O numero "+ segundoNumero + " é maior que "+ primeiroNumero);
        }
       //aqui na ultima condição que dai ele printa valor invalido
        else{
            System.out.print("valor invalido!");
        }
    }
}