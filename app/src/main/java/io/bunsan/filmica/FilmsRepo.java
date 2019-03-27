package io.bunsan.filmica;

import java.util.ArrayList;

public class FilmsRepo {

    private static FilmsRepo instance;

    public static FilmsRepo getInstance() {
        if (instance == null) {
            instance = new FilmsRepo();
        }

        return instance;
    }

    private FilmsRepo() {
    }

    public ArrayList<Film> getFilms() {
        ArrayList<Film> films = new ArrayList<>();

        for(int i = 0; i < 10; i ++) {
            Film film = new Film();
            film.setTitle("Title " + (i + 1));

            films.add(film);
        }

        return films;
    }
}
