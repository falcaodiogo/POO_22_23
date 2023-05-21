package Ex2;

public class ExameEscrito extends Teste{

    private int versoes = 1;
    private boolean consulta = false;
    private int prazoCorrecao = 0;

    public ExameEscrito(String disciplina, String responsavel, String data_hora, String salas, int versoes) {
        super(disciplina, responsavel, data_hora, salas);
        this.versoes = versoes;
    }

    public ExameEscrito(String disciplina, String responsavel, String data_hora, String salas) {
        super(disciplina, responsavel, data_hora, salas);
        versoes = 1;
    }

    public void setConsulta(boolean b) {
        consulta = true;
        this.consulta = b;
    }

    public void setPrazo(int i) {
        this.prazoCorrecao = i;
    }

    public int getPrazo() {
        return prazoCorrecao;
    }

    @Override
    public String toString() {
        return "ExameEscrito{" + "versoes=" + versoes + ", consulta=" + consulta + ", prazoCorrecao=" + prazoCorrecao + '}';
    }
}
