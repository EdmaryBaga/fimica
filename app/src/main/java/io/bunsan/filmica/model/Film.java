package io.bunsan.filmica.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Film {

    private String title;
    private String overview;
    private float rating;
    private ArrayList<Genre> genres;
    private String date;
    private String url;

    public Film() {
        this.title = "";
        this.overview = "";
        this.rating = 0.0f;
        this.genres = new ArrayList<>();
        this.date = "";
        this.url = "";
    }

    public Film(String title, String overview, float rating, ArrayList<Genre> genres, String date, String url) {
        this.title = title;
        this.overview = overview;
        this.rating = rating;
        this.genres = genres;
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

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
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
