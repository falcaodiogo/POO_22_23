package Ex1;
import java.util.ArrayList;

public class Cruzeiro {

    private String nome;
    private String[] portosEscalas;
    private String dataInicio;
    private int duracao;
    private ArrayList<Cabine> cabines;
    private ArrayList<Suite> suites;

    public Cruzeiro(String nome, String[] aux, String dataInicio) {
        this.nome = nome;
        this.portosEscalas = aux;
        this.dataInicio = dataInicio;
        this.cabines = new ArrayList<>();
        this.suites = new ArrayList<>();
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void add(Cabine cabine) {
        this.cabines.add(cabine);
    }

    @Override
    public String toString() {
        // return "Navio " + nome + ", partida em " + dataInicio + "\nItenerário: " + portosEscalas
        StringBuilder sb = new StringBuilder();
        sb.append("Navio ").append(nome).append(", partida em ").append(dataInicio).append("\nItenerário: ").append(portosEscalas.toString()).append("\n");
        for (Cabine c : cabines) {
            sb.append(c.toString()).append("\n");
        }
        for (Suite s : suites) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }

    public void add(Suite suite1) {
        suites.add(suite1);
    }
}
