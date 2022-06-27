package model;

public abstract class Conta {

    private final String numeroConta;
    private final TipoConta tipoConta;
    private Double saldo;

    public Conta(String numeroConta, TipoConta tipoConta) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = 0.0;
    }

    public void depositar(Double valor) throws Exception {
        this.saldo = saldo + valor;
    }

    public void sacar(Double valor) throws Exception {
        if (valor > this.getSaldo()) {
            throw new Exception("Saldo insuficiente");
        }
        this.saldo = saldo - valor;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public Double getSaldo() {
        return saldo;
    }
}
