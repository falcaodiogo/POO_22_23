package Ex1;
public class Cabine {

    int numCab;
    int maxOcup;
    String[] passageiros = new String[maxOcup];

    public Cabine(int numCab, int maxOcup, String[] passageiros) {
        this.numCab = numCab;
        this.maxOcup = maxOcup;
    }

    public void setNumCab(int numCab) {
        this.numCab = numCab;
    }

    public void setMaxOcup(int maxOcup) {
        this.maxOcup = maxOcup;
    }

    public void setPassageiros(String[] passageiros) {
        this.passageiros = passageiros;
    }


}
