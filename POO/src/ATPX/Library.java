package ATPX;

import java.util.ArrayList;

public class Library implements ILibrary {

    // biblioteca de itens existentes
    private static ArrayList<LibraryItem> items = new ArrayList<LibraryItem>();

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    @Override
    public void removeItem(LibraryItem item) {
        if (items.contains(item)) {
            items.remove(item);
        } else {
            System.out.println("Elemento não existe");
        }
    }

    @Override
    public LibraryItem searchForItem(String title) {
        if (items.contains(title))
            return items.get(items.indexOf(title));
        return null;
    }

    @Override
    public boolean borrowItem(int itemId) {
        if (items.contains(itemId)) {
            return true;
        } else {
            System.out.println("Elemento não disponível");
        }
        return false;
    }

    ///////////////////////////////////////////////////
    @Override
    public boolean returnItem(int itemId) {
        return false;
    }

    @Override
    public void printInventory() {
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }

}
