//5. Calcule o fatorial de um número determinado pelo usuário usando for.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,f;
        f=1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n = in.nextInt();
        }while(n<0);

        for(int i=n;i>1;i--)
            f=f*i;

        System.out.println(n+"!= "+ f);

    }
}