package aula09;

public class CommercialPlane extends Plane {

    private int numTribulantes;

    public CommercialPlane(String id, String fabricante, String model, int yearProduction, int maxPassengers,
            int maxSpeed, int numTribulantes) {
        super(id, fabricante, model, yearProduction, maxPassengers, maxSpeed);
        this.numTribulantes = numTribulantes;
    }

    public void setNumTribulantes(int nt) {
        if (nt > 0) {
            this.numTribulantes = nt;
        }
    }

    public int getNumeroTribulantes() {
        return numTribulantes;
    }

    @Override
    public String toString() {
        return "Avião Comercial " + super.toString() + ". // Número de tribulantes: " + numTribulantes;
    }
    
}
