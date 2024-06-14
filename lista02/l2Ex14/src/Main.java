//4. Crie um sistema de vendas onde o usuário insere o valor da compra e escolhe
// a formade pagamento que pode ser: débito, crédito ou pix. Após escolher a forma de
// pagamentoo sistema deve mostrar o total a pagar que deve seguir as seguintes
// regras:• Débito: Conceder desconto de 5%.• Pix: Conceder desconto de 10%.•
// Crédito: taxa de 2% do valor total em parcelamento até 4 vezes ou taxa de 5% do valor
// total em parcelamentos superior a 4 vezes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double v1, result;
        int pag;
        Scanner scan = new Scanner(System.in);


        System.out.print("Insira o valor da compra:\nR$");
        v1 = scan.nextDouble();
        if (v1 > 0) {
            System.out.println("Formas de Pagamento:\n1- Débito.\n2- Pix.\n3- Crédito.");
            System.out.println("Insira uma forma de pagamento:");
            pag = scan.nextInt();

            if (pag > 0 && pag < 4) {

                switch (pag) {

                    case 1:
                        System.out.println("Débito selecionado.");
                        result = (v1 - (v1 / 20));
                        System.out.println("---TOTAL DA COMPRA COM 5% DE DESCONTO---\nR$" + result);
                        break;

                    case 2:
                        System.out.println("Pix selecionado.");
                        result = (v1 - (v1 / 10));
                        System.out.println("---TOTAL DA COMPRA COM 10% DE DESCONTO---\nR$" + result);
                        break;

                    case 3:
                        int par;
                        System.out.println("Selecione a quantidade de vezes em que deseja parcelar a compra: ");
                        par = scan.nextInt();

                        if (par > 0 && par < 5) {
                            result = (v1 + (v1 / 100 * 2));
                            System.out.println("---TOTAL DA COMPRA COM 2% DE JUROS---\nR$" + result);

                        } else if (par >= 5) {

                            result = (v1 + (v1 / 100 * 5));
                            System.out.println("---TOTAL DA COMPRA COM 5% DE JUROS---\nR$" + result);

                        } else
                            System.out.println("Opção Inválida!");
                        break;

                    default:
                        System.out.println("Opção inválida!");


                }

            } else {
                System.out.println("Opção inválida!");
            }

        }
        else
            System.out.println("Valor inválido!");
    }
}