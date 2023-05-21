package Ex2;

import java.util.ArrayList;

public class Teste {

    protected String disciplina;
    protected String responsavel;
    protected String data_hora;
    protected ArrayList<String> salas;

    public Teste(String disciplina, String responsavel, String data_hora, String salas) {
        this.disciplina = disciplina;
        this.responsavel = responsavel;
        this.data_hora = data_hora;
        this.salas = new ArrayList<>();
    }
    
}
