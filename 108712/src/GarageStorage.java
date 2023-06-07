
public class GarageStorage extends StorageUnit {

    private int duration;
    private Type type = Type.GarageStorage;

    public GarageStorage(String localizacao, int[] dimensoes, int precoDia) {
        super(localizacao, dimensoes, precoDia);
        this.duration = 5*365;
    }

    public int getDuration() {
        return duration;
    }

    public Type getType() {
        return type;
    }


}
