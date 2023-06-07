public abstract class StorageUnit {

    private String localizacao;
    private int[] dimensoes;
    private int precoDia;

    public StorageUnit(String localizacao, int[] dimensoes, int precoDia) {
        this.localizacao = localizacao;
        this.dimensoes = dimensoes;
        this.precoDia = precoDia;
    }


    public String getLocalizacao() {
        return localizacao;
    }

    public int getPrecoDia() {
        return precoDia;
    }

    public int[] getDimensoes() {
        return dimensoes;
    }

    abstract public Type getType();

    @Override
    public String toString() {
        return localizacao + ", " + precoDia + "/day";
    }

    // getType. To define the type in extended classes, use the following code:
    
    
}
