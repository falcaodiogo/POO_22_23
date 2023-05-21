package Ex2;

import java.util.ArrayList;

public class Escola {

    private String nome;
    private String endereco;
    private ArrayList<Teste> testes;

    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        testes = new ArrayList<>();
    }

    public void add(Teste e1) {
        testes.add(e1);
    }

    @Override
    public String toString() {
        return "Escola{" + "nome=" + nome + ", endereco=" + endereco + ", testes=" + testes + '}';
    }

}
