// Nossa classe principal, onde a magia acontece
public class Main {
    // O famoso método principal, onde tudo começa
    public static void main(String[] args) {
        // Criando uma conta bancária para o Caina com ID 56
        ContaBancaria c1 = new ContaBancaria(56, "Caina Antunes Silva");

        // Tentando depositar 100 na conta do Caina
        if(c1.depositar(100)) {
            // Se der certo, avisamos que deu bom
            System.out.println("Depósito realizado com sucesso!");
        } else  {
            // Se não der certo, avisamos que o valor é inválido
            System.out.println("Valor inválido!");
        }

        // Mostrando o saldo atual do Caina
        System.out.println(c1.getSaldo());

        // Tentando sacar 13.40 da conta do Caina
        if(c1.sacar(13.40)) {
            // Se der certo, avisamos que o saque foi feito
            System.out.println("Saque realizado com sucesso!");
        } else  {
            // Se não der certo, avisamos que o valor é inválido
            System.out.println("Valor inválido!");
        }

        // Mostrando o saldo do Caina depois do saque
        System.out.println(c1.getSaldo());

        // Criando uma conta bancária para o Andre com ID 8888
        ContaBancaria c2 = new ContaBancaria(8888, "Andre");
        // Mostrando os detalhes da conta do Andre
        System.out.println(c2);

        // Mostrando os detalhes da conta do Caina de novo, só pra conferir
        System.out.println(c1);
    }
}
