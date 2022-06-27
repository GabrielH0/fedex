package model;

public class ContaCorrente extends Conta {

    private static final Double LIMITE_DEPOSITO_CONTA_CORRENTE = 5000.00;

    public ContaCorrente(String numeroConta) {
        super(numeroConta, TipoConta.CONTA_CORRENTE);
    }

    @Override
    public void depositar(Double valor) throws Exception {
        if (valor > LIMITE_DEPOSITO_CONTA_CORRENTE) {
            throw new Exception("O valor maximo de deposito para conta corrente é de "
                    + LIMITE_DEPOSITO_CONTA_CORRENTE);
        }
        super.depositar(valor);
    }
}
