package aula08.Ex1;

public class Ligeiro extends Veiculo {

    private int NumQuadro;
    private int BagCap;

    public Ligeiro(String matricula, String marca, String modelo, int cv, int NumQuadro, int BagCap) {
        super(matricula, marca, modelo, cv);
        this.NumQuadro = NumQuadro;
        this.BagCap = BagCap;
    }

    public void setNumQuadro(int NQ) {
        this.NumQuadro = NQ;
    }

    public void setBagCap(int BC) {
        this.BagCap = BC;
    }

    @Override
    public String toString() {
        return "Ligeiro" + super.toString() + ", Numero de Quadro: " + NumQuadro + ", Capacidade de bagageira: " + BagCap;
    }
    
}
