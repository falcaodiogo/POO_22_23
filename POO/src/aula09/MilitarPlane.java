package aula09;

public class MilitarPlane extends Plane {

    private int numeroMunicoes;

    public MilitarPlane(String id, String fabricante, String model, int yearProduction, int maxPassengers,
            int maxSpeed, int numeroMunicoes) {
        super(id, fabricante, model, yearProduction, maxPassengers, maxSpeed);
        this.numeroMunicoes = numeroMunicoes;
    }

    public void setNumeroMunicoes(int nm) {
        if (nm >= 0) {
            this.numeroMunicoes = nm;
        }
    }

    @Override
    public String toString() {
        return "Avião Militar " + super.toString() + ". // Número de munições: " + numeroMunicoes;
    }
    
}
