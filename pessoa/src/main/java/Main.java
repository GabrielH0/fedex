import model.*;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        PessoaFisica pessoaFisica = new PessoaFisica("João Silva", List.of(new ContaPoupanca("0001"),
                new ContaCorrente("00002")), "000000000-00");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("TNT", List.of(new ContaCorrente("00002")),
                "00000000/0001-00", "TNT Cargas e Encomendas");
        printPessoa(List.of(pessoaFisica, pessoaJuridica));
    }

    public static void printPessoa(List<Pessoa> pessoas) {
        pessoas.forEach(pessoa -> System.out.println(pessoa.toString() + ","));
    }
}
