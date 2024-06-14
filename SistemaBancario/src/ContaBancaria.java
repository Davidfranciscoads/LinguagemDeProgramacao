public class ContaBancaria {
    // Atributos da conta, como número da conta, saldo e nome do dono

    // Número único de identificação da conta bancária
    private int numero;

    // Saldo atual da conta bancária
    private double saldo;

    // Nome do titular da conta bancária
    private String titular;


    // Construtor da conta bancária, que cria a conta com número e titular
    public ContaBancaria(int numero, String titular) {

        // Define o número da conta
        this.numero = numero;

        // Saldo inicial, começando com zero
        this.saldo = 0.0;

        // Define o nome do dono da conta
        this.titular = titular;
    }

    // Método para depositar grana na conta
    public boolean depositar(double valor) {

        // Se o valor for zero ou negativo, não dá pra depositar
        if (valor <= 0) {

            // Depósito inválido
            return false;
        }

        // Se o valor for válido, adiciona ao saldo
        this.saldo += valor;

        // Depósito realizado com sucesso
        return true;
    }

    // Método para sacar o dinheiro da conta
    public boolean sacar(double valor) {

        // Se o valor for zero ou negativo, ou maior que o saldo, não dá pra sacar
        if (valor <= 0 || this.saldo < valor) {

            // Saque inválido
            return false;
        }

        // Se o valor for válido, subtrai do saldo
        this.saldo -= valor;

        // Saque realizado com sucesso
        return true;
    }

    // Getter para obter o saldo atual da conta

    // Retorna o saldo atual
    public double getSaldo() {
        return this.saldo;
    }

    // Getter para obter o nome do dono da conta

    // Retorna o nome do titular da conta
    public String getTitular() {
        return titular;
    }

    // Setter para atualizar o nome do dono da conta
    public void setTitular(String titular) {

        // Define um novo titular para a conta
        this.titular = titular;
    }

    // Método para retornar uma string com os detalhes da conta
    @Override

    public String toString() {

        // Retorna uma string formatada com o número da conta, saldo e titular
        return "ContaBancaria{" +

                // Adiciona o número da conta à string
                "numero=" + numero +

                // Adiciona o saldo da conta à string
                ", saldo=" + saldo +

                // Adiciona o nome do titular à string, com aspas simples ao redor
                ", titular='" + titular + '\'' +
                '}';
    }
}
