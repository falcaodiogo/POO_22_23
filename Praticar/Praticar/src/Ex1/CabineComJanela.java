package Ex1;

public class CabineComJanela extends Cabine{

    private TipoDeJanela tipojanela;
    private Cabine c;
    private Extra pacote;

    public CabineComJanela(int numCab, int maxOcup, TipoDeJanela tipojanela, String[] passageiros) {
        super(numCab, maxOcup, passageiros);
        this.tipojanela = tipojanela;
    }

    public CabineComJanela(int numCab, int maxOcup, TipoDeJanela tipoDeJanela) {
        super(numCab, maxOcup, null);
        this.tipojanela = tipoDeJanela;
	}

	public void setPassageiros(String[] split) {
        c = new Cabine(numCab, maxOcup, split);
    }

    public void pacoteExtra(Extra pacote) {
        this.pacote = pacote;
    }

    public TipoDeJanela getTipojanela() {
        return tipojanela;
    }

    public Cabine getC() {
        return c;
    }

    public Extra getPacote() {
        return pacote;
    }

    @Override
    public String toString() {
        return "Cabine com Janela " + tipojanela + " [ Nº" + numCab + "( max " + maxOcup + " pessoas ) : " + passageiros.toString();
    }

}
