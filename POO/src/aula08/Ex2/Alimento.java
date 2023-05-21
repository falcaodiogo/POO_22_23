package aula08.Ex2;

public class Alimento {

    protected double prota;
    protected double calorias;
    protected double peso;

    public Alimento(double prota, double calorias, double peso) {
        this.prota = prota;
        this.calorias = calorias;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return " com " + prota + " proteinas, " + calorias + " calorias, " + peso + " de peso";
    }

}
