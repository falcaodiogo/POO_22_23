package Ex2;

public class ProvaOral extends Teste {

    private Lingua lingua;

    public ProvaOral(String disciplina, String responsavel, String data_hora, String salas, Lingua lingua) {
        super(disciplina, responsavel, data_hora, salas);
        this.lingua = lingua;
    }

    @Override
    public String toString() {
        return "ProvaOral{" + "lingua=" + lingua + '}';
    }

}
