package aula08.Ex1;

public class Taxi extends Veiculo {

    private int NumLicenca;

    public Taxi(String matricula, String marca, String modelo, int cv, int NumLicenca) {
        super(matricula, marca, modelo, cv);
        this.NumLicenca = NumLicenca;
    }

    public void SetNumLicenca(int NL) {
        this.NumLicenca = NL;
    }

    @Override
    public String toString() {
        return "Taxi" + super.toString() + ", Numero de licença: " + NumLicenca;
    }
    
}
