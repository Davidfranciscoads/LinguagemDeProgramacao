//6. Em um sistemas de caixa eletrônico o usuário deve escolher entre as opções de
// um menu escolhendo um número inteiro entre 5 e 9 inclusive. Crie um algoritmo que
// validea entrada do usuário exibindo a opções escolhida ou a mensagem de opção inválida
// casoo usuário entre com um número fora do range estabelecido


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha uma das opções do menu:");
        System.out.println("5 - Saldo");
        System.out.println("6 - Saque");
        System.out.println("7 - Depósito");
        System.out.println("8 - Transferência");
        System.out.println("9 - Pagamentos");

        System.out.print("Digite a opção desejada entre 5 e 9 ");
        opcao = scanner.nextInt();

        if (opcao == 5) {
            System.out.println("Você escolheu a opção Saldo ");
        } else if (opcao == 6) {
            System.out.println("Você escolheu a opção Saque ");
        } else if (opcao == 7) {
            System.out.println("Você escolheu a opção Depósito ");
        } else if (opcao == 8) {
            System.out.println("Você escolheu a opção Transferência ");
        } else if (opcao == 9) {
            System.out.println("Você escolheu a opção Pagamentos ");
        } else {
            System.out.println("Opção inválida ");
        }
    }
}
