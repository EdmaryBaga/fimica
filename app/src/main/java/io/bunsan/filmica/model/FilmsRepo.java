package io.bunsan.filmica.model;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;

public class FilmsRepo {

    private static FilmsRepo instance;
    private FilmicaApi client;

    public static FilmsRepo getInstance() {
        if (instance == null) {
            instance = new FilmsRepo();
        }

        return instance;
    }

    private FilmsRepo() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://5c9e63d1595c55001487bf09.mockapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        client = retrofit.create(FilmicaApi.class);
    }

    public void getFilms(Callback<ArrayList<Film>> callback) {
        this.client.getFilms().enqueue(callback);
    }
}
