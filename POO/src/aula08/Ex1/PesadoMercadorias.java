package aula08.Ex1;

public class PesadoMercadorias extends Veiculo {

    private int NumQuadro;
    private int peso;
    private int cargaMaxima;

    public PesadoMercadorias(String matricula, String marca, String modelo, int cv, int NumQuadro, int peso, int cargaMaxima) {
        super(matricula, marca, modelo, cv);
        this.NumQuadro = NumQuadro;
        this.peso = peso;
        this.cargaMaxima = cargaMaxima;
    }

    public void setNumQuadro(int NQ) {
        this.NumQuadro = NQ;
    }

    public void setPeso(int p) {
        this.peso = p;
    }

    public void setCargaMaxima(int CM) {
        this.cargaMaxima = CM;
    }

    @Override
    public String toString() {
        return "Pesado Mercadorias" + super.toString() + ", Numero de quadro: " + NumQuadro + ", peso: " + peso + ", carga máxima: " + cargaMaxima;
    }
    
}
