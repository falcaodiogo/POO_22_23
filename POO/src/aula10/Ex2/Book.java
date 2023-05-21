package aula10.Ex2;

public class Book {

    private String title;
    private String author;
    private int year;
    private Genero genre;

    public Book(String title, String author, int year, Genero genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Genero getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", year=" + year + ", genre=" + genre + "]";
    }
    
}
