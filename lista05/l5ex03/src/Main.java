//3. Crie uma função para calcular a potência de um número inteiro X elevado
// a uma potênciainteira Y. Os valores de X e Y serão fornecidos pelo usuário. Y
// deve ser maior ou igual azero. Proibido utilizar Math.pow(x,y)

public class Main {
    public static void main(String[] args) {

        int n = 10;
        int somaTotal = somaAteN(n);
        if (somaTotal == -1) {
            System.out.println("Erro: N deve ser maior que 0.");
        } else {
            System.out.println("A soma dos números de 1 até " + n + " é: " + somaTotal);
        }
    }

    public static int somaAteN(int n) {
        if (n <= 0) {
            return -1; // Retorna um valor indicando um erro
        }

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}