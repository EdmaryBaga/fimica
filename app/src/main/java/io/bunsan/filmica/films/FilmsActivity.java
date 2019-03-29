package io.bunsan.filmica.films;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import io.bunsan.filmica.detail.DetailsFragment;
import io.bunsan.filmica.R;

public class FilmsActivity extends AppCompatActivity implements DetailsFragment.OnFragmentClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films);

        if (savedInstanceState == null) {
            FilmsFragment fragment = FilmsFragment.newInstance("Hello World");

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, fragment)
                    .commit();
        }
    }

    public void onClick() {

    }

}
