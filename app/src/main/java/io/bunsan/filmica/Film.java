package io.bunsan.filmica;

public class Film {

    private String title;
    private String overview;
    private float rating;
    private String genre;
    private String date;
    private String url;

    public Film() {
        this.title = "";
        this.overview = "";
        this.rating = 0.0f;
        this.genre = "";
        this.date = "";
        this.url = "";
    }

    public Film(String title, String overview, float rating, String genre, String date, String url) {
        this.title = title;
        this.overview = overview;
        this.rating = rating;
        this.genre = genre;
        this.date = date;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
