
public class LockerStorage extends StorageUnit {

    private int duration;
    private Type type = Type.LockerStorage;

    public LockerStorage(String localizacao, int[] dimensoes, int precoDia) {
        super(localizacao, dimensoes, precoDia);
        this.duration = 30;
    }

    public int getDuration() {
        return duration;
    }

    public Type getType() {
        return type;
    }

}
