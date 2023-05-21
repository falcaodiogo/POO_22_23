package aula08.Ex2;

import java.util.ArrayList;

public class Ementa {

    private String name;
    private String local;
    private ArrayList<Prato> pratos;

    public Ementa(String name, String local) {
        this.name = name;
        this.local = local;
    }

    @Override
    public String toString() {
        return "Ementa " + name + ". Local: " + local + "; Pratos: " + pratos.toString();
    }

    public void addPrato(Prato prato, DiaSemana diaSemana) {
    }
}
