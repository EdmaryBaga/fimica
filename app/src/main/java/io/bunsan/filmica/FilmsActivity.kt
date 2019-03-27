package io.bunsan.filmica

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

class FilmsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_films)

        val list: RecyclerView = findViewById(R.id.list)
        list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val adapter: FilmsAdapter = FilmsAdapter()
        adapter.setFilms(FilmsRepo.getInstance().films)

        list.adapter = adapter

    }

    fun showFilm(view: View) {
        val intent: Intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}