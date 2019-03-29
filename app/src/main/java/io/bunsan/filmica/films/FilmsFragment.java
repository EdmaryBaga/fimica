package io.bunsan.filmica.films;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

public class FilmsFragment extends Fragment {

    private String message;

    public static FilmsFragment newInstance(String message) {
        FilmsFragment instance = new FilmsFragment();
        Bundle args = new Bundle();

        args.putString("MESSAGE", message);
        instance.setArguments(args);

        return instance;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.message = this.getArguments().getString("MESSAGE", "");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_films, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();

        FilmsRepo.getInstance().getFilms(new Callback<ArrayList<Film>>() {
            @Override
            public void onResponse(Call<ArrayList<Film>> call, Response<ArrayList<Film>> response) {

            }

            @Override
            public void onFailure(Call<ArrayList<Film>> call, Throwable t) {

            }
        });
    }
}
