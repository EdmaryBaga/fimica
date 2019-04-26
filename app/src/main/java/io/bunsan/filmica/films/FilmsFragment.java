package io.bunsan.filmica.films;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.bunsan.filmica.R;
import io.bunsan.filmica.model.Film;
import io.bunsan.filmica.model.FilmsRepo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;

public class FilmsFragment extends Fragment implements FilmsAdapter.OnItemClickListener {

    private String message;
    private FilmsAdapter adapter;

    public static FilmsFragment newInstance(String message) {
        FilmsFragment instance = new FilmsFragment();
        Bundle args = new Bundle();

        args.putString("MESSAGE", message);
        instance.setArguments(args);

        return instance;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_films, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView list = view.findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(getContext()));

        this.adapter = new FilmsAdapter(this);
        list.setAdapter(adapter);

    }

    @Override
    public void onResume() {
        super.onResume();

        FilmsRepo.getInstance().getFilms(new Callback<ArrayList<Film>>() {
            @Override
            public void onResponse(Call<ArrayList<Film>> call, Response<ArrayList<Film>> response) {
                adapter.setFilms(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<Film>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    @Override
    public void onItemClick(Film film) {

    }
}
