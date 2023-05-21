package aula12;

public class Movie {

    private String name;
    private float score;
    private String rating;
    private String genre;
    private int running_time;

    public Movie(String name, float score, String rating, String genre, int running_time) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.running_time = running_time;
    }

    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }

    public String getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public int getRunning_time() {
        return running_time;
    }

    @Override
    public String toString() {
        return name + " || has score of " + score + "|| and a rating of " + rating + ". The genre is " + genre + " and the running time " + running_time;
    }
}
