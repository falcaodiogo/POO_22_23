package aula08.Ex2;

import java.util.ArrayList;

public class Prato {

    protected String name;
    protected ArrayList<Alimento> alimentos = null;

	public Prato(String name, ArrayList<Alimento> alimentos) {
        this.name = name;
        this.alimentos = alimentos;
    }

    public Prato(String name) {
        this.name = name;
    }

    public boolean addIngrediente(Alimento aux) {
        if (alimentos.contains(aux))
		    return false;
        else if (alimentos == null)
            return false;
        else 
            alimentos.add(aux);
            return true;
	}

    @Override
    public String toString() {
        if (alimentos == null) 
            return "Prato '" + name + "', composto por 0 Ingredientes";
        return " com nome " + name + ", e alimentos: " + alimentos.toArray();
    }

}
