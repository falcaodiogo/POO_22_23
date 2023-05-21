package aula08.Ex2;

import java.util.ArrayList;

public class PratoDieta extends Prato{

    private double maxCal = 0;

    public PratoDieta(String name, ArrayList<Alimento> alimentos) {
        super(name, alimentos);
    }

    public PratoDieta(String name, double maxCal) {
        super(name);
        this.maxCal = maxCal;
    }

    @Override
    public String toString() {
        return super.toString() + " com " + maxCal + " calorias máximas";
    }

}
