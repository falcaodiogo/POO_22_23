
public class WarehouseStorage extends StorageUnit {

    private int duration;
    private Type type = Type.WarehouseStorage;

    public WarehouseStorage(String localizacao, int[] dimensoes, int precoDia) {
        super(localizacao, dimensoes, precoDia);
        this.duration = 10*365;
    }
    
    public void setType(Type type) {
        (this.type) = type;
    }

    public int getDuration() {
        return duration;
    }

    public Type getType() {
        return type;
    }

}
