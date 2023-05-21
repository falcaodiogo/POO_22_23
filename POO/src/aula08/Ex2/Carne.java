package aula08.Ex2;

public class Carne extends Alimento{

    private VariedadeCarne v;

    public Carne(VariedadeCarne v, double prota, double calorias, double peso) {
        super(prota, calorias, peso);
        this.v = v;
    }

    @Override
    public String toString() {
        return "Carne de" + v + super.toString();
    }

}
