package io.bunsan.filmica;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.FilmHolder> {

    private ArrayList<Film> films;

    public FilmsAdapter() {
        this.films = new ArrayList<>();
    }

    @NonNull
    @Override
    public FilmHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_film,
                viewGroup, false);

        return new FilmHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmHolder filmHolder, int position) {
        Film film = films.get(position);
        filmHolder.setFilm(film);
    }

    @Override
    public int getItemCount() {
        return this.films.size();
    }

    public void setFilms(ArrayList<Film> films) {
        this.films.clear();
        this.films.addAll(films);

        this.notifyDataSetChanged();
    }

    class FilmHolder extends RecyclerView.ViewHolder {

        FilmHolder(View view) {
            super(view);
        }

        void setFilm(Film film) {
            ((TextView)this.itemView).setText(film.getTitle());
        }

    }
}
