package Ex2;

public class TesteComputador extends Teste{

    private String link;

    public TesteComputador(String disciplina, String responsavel, String data_hora, String salas) {
        super(disciplina, responsavel, data_hora, salas);
    }

    public void setLink(String string) {
        this.link = string;
    }

    @Override
    public String toString() {
        return "TesteComputador{" + "link=" + link + '}';
    }

}
