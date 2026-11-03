class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class Conta {
    private double saldo;
    private final double limite;

    public Conta(double saldoInicial, double limite) {
        if (saldoInicial < 0 || limite < 0) {
            throw new IllegalArgumentException("Saldo e limite não podem ser negativos.");
        }
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }

        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException(
                "Saque não autorizado: o valor ultrapassa o saldo disponível e o limite."
            );
        }

        saldo -= valor;
        System.out.printf("Saque realizado. Saldo atual: R$ %.2f%n", saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}

public class Exercicio3Conta {
    public static void main(String[] args) {
        Conta conta = new Conta(500.00, 200.00);
        double valorDoSaque = 800.00;

        try {
            conta.sacar(valorDoSaque);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
