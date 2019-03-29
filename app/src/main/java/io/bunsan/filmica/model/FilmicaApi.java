package io.bunsan.filmica.model;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.ArrayList;

public interface FilmicaApi {

    @GET("films")
    public Call<ArrayList<Film>> getFilms();
}
