package aula08.Ex2;

public class Legume extends Alimento{

    private String name;

    public Legume(String name, double prota, double calorias, double peso) {
        super(prota, calorias, peso);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Legume " + name + super.toString();
    }    

}
