package Ex1;

public class CabineComVaranda extends Cabine {

    private TipoDeVaranda tipoVaranda;
    private Extra pacote;

    public CabineComVaranda(int numCab, int maxOcup, String[] passageiros) {
        super(numCab, maxOcup, passageiros);
    }

    public CabineComVaranda(int numCab, int maxOcup, TipoDeVaranda tipoDeVaranda) {
        super(numCab, maxOcup, null);
        this.tipoVaranda = tipoDeVaranda;
    }

    public void setTipoVaranda(TipoDeVaranda tipoVaranda) {
        this.tipoVaranda = tipoVaranda;
    }

    public void pacoteExtra(Extra pacote) {
        this.pacote = pacote;
    }

    public void setPassageiros(String[] split) {
        this.passageiros = split;
    }

    public TipoDeVaranda getTipoVaranda() {
        return tipoVaranda;
    }

    public Extra getPacote() {
        return pacote;
    }

    @Override
    public String toString() {
        return super.toString() + "CabineComVaranda{" + "tipoVaranda=" + tipoVaranda + ", pacote=" + pacote + '}';
    }

}
