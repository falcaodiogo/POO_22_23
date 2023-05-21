package aula06;

public class Bolseiro extends Aluno{

    private Professor professor;
    private int bolsa;

    public Bolseiro(String nome, int cc, DateYMD dataNasc) {
        super(nome, cc, dataNasc);
    }

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor professor, int bolsa) {
        super(nome, cc, dataNasc);
        this.bolsa = bolsa;
        this.professor = professor;
    }

    public void setBolsa(int b) {
        bolsa = b;
    }

    public int getBolsa() {
        return bolsa;
    }

    public Professor getOrientador() {
        return professor;
    }

}
