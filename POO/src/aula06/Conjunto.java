package aula06;

import java.util.*;

public class Conjunto {

    private ArrayList<Integer> conjunto = new ArrayList<Integer>();

    public void insert(int i) {
        conjunto.add(i);
    }

    public void remove(int i) {
        if (i >= 0 && i < conjunto.size()) {
            conjunto.remove(i);
        } else {
            System.out.println("Elemento não existe");
        }
    }

    public String size() {
        return Integer.toString(conjunto.size());
    }

    public boolean contains(int i) {
        if (conjunto.contains(i))
            return true;
        return false;
    }

    // public String unir(Conjunto c2) {
    //     return null;
    // }

    // public String interset(Conjunto c2) {
    //     return null;
    // }

    // public String subtrair(Conjunto c2) {
    //     return null;
    // }

    public void empty() {
        conjunto.clear();
    }

    @Override
    public String toString() {
        return "Conjunto = [" + conjunto + "]";
    }

}
