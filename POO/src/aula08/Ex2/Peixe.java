package aula08.Ex2;

public class Peixe extends Alimento{

    private TipoPeixe v;

    public Peixe(TipoPeixe v, double prota, double calorias, double peso) {
        super(prota, calorias, peso);
        this.v = v;
    }

    @Override
    public String toString() {
        return "Peixe de " + v + super.toString();
    }    

}
