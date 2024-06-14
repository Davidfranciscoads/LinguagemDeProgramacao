//4.Escreva uma função em Java para verificar se uma String é um
// palíndromo. A Stringdeve ser digitada pelo usuário. Um palíndromo é uma palavra,
// frase ou sequência quese lê da mesma forma de trás para frente. Exemplos: “ovo”, “
// tenet”, “a base do teto desaba.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Soma = " + somar(receber()));
    }

    static int receber() {
        Scanner in = new Scanner(System.in);

        int n;

        do {
            System.out.println("Digite um numero maior que 0:");
            n = in.nextInt();
        } while (n <= 0);

        return n;
    }

    static int somar (int n) {
        if(n==1)
            return 1;

        return n+somar(n-1);
    }
}