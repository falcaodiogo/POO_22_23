package aula10.Ex1;

import java.util.ArrayList;

public class BookLibrary {

    private ArrayList<Book> books;

    public BookLibrary() {
        this.books = new ArrayList<>();
    }

    // adicionar livro
    public void addBook(Book b) {
        this.books.add(b);
    }

    // remover livro pelo titulo
    public void removeBook(String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(title)) {
                this.books.remove(i);
            }
        }
    }

    // listar livros
    public ArrayList<Book> getBooks() {
        return books;
    }
    
}
