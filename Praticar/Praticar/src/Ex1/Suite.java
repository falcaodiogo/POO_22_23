package Ex1;
import java.util.ArrayList;

public class Suite {

    ArrayList<Cabine> cabines;
    int SuiteNumber;
    int maxOcup;

    public Suite(int SuiteNumber, int maxOcup) {
        this.SuiteNumber = SuiteNumber;
        this.maxOcup = maxOcup;
    }

    public void setNumQuartos(int numQuartos) {
        cabines = new ArrayList<>();
    }

    public void setMaxOcupantes(int maxOcup) {
        this.maxOcup = maxOcup;
    }

    public void setPassageiros(String[] split) {
        for (String s : split) {
            this.cabines.add(new Cabine(SuiteNumber, maxOcup, split));
        }
    }

    @Override
    public String toString() {
        return "Suite c/" + cabines.size() + " quartos [Nº" + SuiteNumber + "( max " + maxOcup + " pessoas ) : " + cabines.toString();
    }

}
