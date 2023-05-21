package aula08.Ex1;

;

public class Motocliclo extends Veiculo {

    private String tipo;

    public Motocliclo(String matricula, String marca, String modelo, int cv, String tipo) {
        super(matricula, marca, modelo, cv);
        this.tipo = tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    @Override
    public String toString() {
        return "Motociclo" + super.toString() + ", tipo: " + tipo;
    }

    
}
