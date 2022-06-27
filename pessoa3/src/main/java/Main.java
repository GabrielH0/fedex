import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pessoa maria = new Pessoa("Maria", 31);
        Pessoa maria1 = new Pessoa("Maria", 23);
        Pessoa joao = new Pessoa("João", 40);
        Pessoa francisco = new Pessoa("Francisco", 40);
        Pessoa manuela = new Pessoa("Manuela", 15);
        Pessoa joao1 = new Pessoa("Joao", 20);
        List<Pessoa> pessoas = Arrays.asList(maria, maria1, joao, francisco, manuela, joao1);
        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        System.out.println("Lista ordenado por nome: " + pessoas);
        pessoas.sort(Comparator.comparing(Pessoa::getNome)
                .thenComparing(Pessoa::getIdade));
        System.out.println("Lista ordenada por nome e idade: " + pessoas);

    }
}
