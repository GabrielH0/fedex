package model;

import java.util.List;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, List<Conta> contas, String cnpj, String nomeFantasia) throws Exception {
        super(nome, contas);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public PessoaJuridica(String nome, List<Conta> contas) throws Exception {
        super(nome, contas);
    }

    @Override
    public void validarContas() throws Exception {
        if (this.getContas() == null || this.getContas().isEmpty() || !possuiContaCorrente()) {
            throw  new Exception("model.Pessoa jurídica deve possuir no mínimo uma conta corrente");
        }
    }

    private boolean possuiContaCorrente() {
        return this.getContas().stream().anyMatch(conta -> conta.getTipoConta().equals(TipoConta.CONTA_CORRENTE));
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    @Override
    public String toString() {
        return this.nomeFantasia;
    }
}
