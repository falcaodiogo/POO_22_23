import java.time.LocalDate;

public class Rental {

    private StorageUnit aluguer;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public Rental(StorageUnit aluguer, LocalDate dataInicial, LocalDate dataFinal) {
        this.aluguer = aluguer;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public StorageUnit getAluguer() {
        return aluguer;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    @Override
    public String toString() {
        return "\n- [" + dataInicial + " - " + dataFinal + "] " + aluguer.toString();
    }
    
}
