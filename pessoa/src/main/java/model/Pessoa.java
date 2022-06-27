package model;

import java.util.List;


public abstract class Pessoa {

    private final String nome;
    private final List<Conta> contas;

    public Pessoa(String nome, List<Conta> contas) throws Exception {
        this.nome = nome;
        this.contas = contas;
        validarContas();
    }

    public abstract void validarContas() throws Exception;

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
