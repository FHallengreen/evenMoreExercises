package exercise2;

public class Film {

    private String movieTitle;
    private int releaseYear;
    private Producer producer;


    public Film(String movieTitle, int releaseYear) {
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
    }

    public Film(String movieTitle) {
        this.movieTitle = movieTitle;
        this.releaseYear = 2022;
    }

    public Film(String movieTitle, int releaseYear, Producer producer) {
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
        this.producer = producer;
    }

    public static void main(String[] args) {
        Film film = new Film("Hej med dig",2022,new Producer("Ulrik"));
    }
}
