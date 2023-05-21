package ATPX;

public class Book extends LibraryItem{

    private String nameAuthor;

    public Book(String title, int id, boolean availability, String username, String nameAuthor) {
        super(title, id, availability, username);
        this.nameAuthor = nameAuthor;        
    }

    public void setNameAuthor(String n) {
        this.nameAuthor = n;
    }

    @Override
    public String toString() {
        return "Title: " + title + " ,id: " + id + " ,availability:" + availability + " ,username: " + userName + " ,name of author: " + nameAuthor;
    }
    
}
