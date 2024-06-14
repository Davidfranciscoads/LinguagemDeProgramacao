//10. Receber três números inteiros e exibi-los em ordem crescente

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menor, meio, maior, auxiliar;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 inteiros");
        menor = in.nextInt();
        meio = in.nextInt();
        maior = in.nextInt();

        if(maior<menor){
            auxiliar = menor;
            menor = maior;
            maior = auxiliar;
        }
        if(maior<meio){
            auxiliar = meio;
            meio = maior;
            maior = auxiliar;
        }
        if(meio<menor){
            auxiliar=menor;
            menor=meio;
            meio=auxiliar;
        }
        System.out.println(menor+" "+ meio +" "+ maior);
    }
}