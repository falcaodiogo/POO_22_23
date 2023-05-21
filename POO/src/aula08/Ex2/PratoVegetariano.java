package aula08.Ex2;

import java.util.ArrayList;

public class PratoVegetariano extends Prato{

    public PratoVegetariano(String name, ArrayList<Alimento> alimentos) {
        super(name, alimentos);
    }

    public PratoVegetariano(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
