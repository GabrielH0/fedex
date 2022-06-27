package model;

public class ContaPoupanca extends Conta {

    private static final Double LIMITE_DEPOSITO_POUPANCA = 2000.00;

    public ContaPoupanca(String numeroConta) {
        super(numeroConta, TipoConta.CONTA_POUPANCA);
    }

    @Override
    public void sacar(Double valor) throws Exception {
        if (valor > LIMITE_DEPOSITO_POUPANCA) {
            throw new Exception("O valor máximo de saque da conta poupança é de " + LIMITE_DEPOSITO_POUPANCA);
        }
        super.sacar(valor);
    }
}
