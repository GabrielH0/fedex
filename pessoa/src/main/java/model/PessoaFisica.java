package model;

import java.util.List;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, List<Conta> contas, String cpf) throws Exception {
        super(nome, contas);
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, List<Conta> contas) throws Exception {
        super(nome, contas);
    }

    @Override
    public void validarContas() throws Exception {
        if (this.getContas() == null || this.getContas().isEmpty() || !possuiContaCorrenteEContaPoupanca()) {
            throw new Exception("model.Pessoa Fisica deve possuir uma conta poupança e uma conta corrente");
        }
    }

    public boolean possuiContaCorrenteEContaPoupanca() {
        return this.getContas().stream().anyMatch(conta -> conta.getTipoConta().equals(TipoConta.CONTA_POUPANCA))
                && this.getContas().stream().anyMatch(conta -> conta.getTipoConta().equals(TipoConta.CONTA_CORRENTE));
    }
}
