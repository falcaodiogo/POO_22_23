package ATPX;

public class DVD extends LibraryItem {

    private double duracao;

    public DVD(String title, int id, boolean availability, String username, double duracao) {
        super(title, id, availability, username);
        this.duracao = duracao;
    }

    public void setDuracao(double d) {
        if (d > 0) {
            this.duracao = d;
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + " ,id: " + id + " ,availability:" + availability + " ,username: " + userName + " ,duracao:" + duracao;
    }
    
}
