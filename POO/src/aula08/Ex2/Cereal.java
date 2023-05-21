package aula08.Ex2;

public class Cereal extends Alimento{

    private String nome;

    public Cereal(String nome, double prota, double calorias, double peso) {
        super(prota, calorias, peso);
        this.nome = nome;
    }    

    @Override
    public String toString() {
        return "Cereal " + super.toString() + ", nome: " + nome;
    }

}
