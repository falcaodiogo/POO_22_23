package aula08.Ex1;

public class PesadoPassageiros extends Veiculo {

    private int NumQuadro;
    private int peso;
    private int NumMaxPassageiros;

    public PesadoPassageiros(String matricula, String marca, String modelo, int cv, int NumQuadro, int peso, int NumMaxPassageiros) {
        super(matricula, marca, modelo, cv);
        this.NumQuadro = NumQuadro;
        this.peso = peso;
        this.NumMaxPassageiros = NumMaxPassageiros;
    }

    public void setNumQuadro(int NQ) {
        this.NumQuadro = NQ;
    }

    public void setPeso(int p) {
        this.peso = p;
    }

    public void setNumMaxPassageiros(int NMP) {
        this.NumMaxPassageiros = NMP;
    }

    @Override
    public String toString() {
        return "Pesado Passageiros" + super.toString() + ", Numero de quadro: " + NumQuadro + ", peso: " + peso + ", Numero máximo de passageiros: " + NumMaxPassageiros;
    }
    
}
