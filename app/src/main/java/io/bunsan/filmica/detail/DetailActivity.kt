package io.bunsan.filmica.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import io.bunsan.filmica.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val add: Button = findViewById(R.id.btn_add)
        add.setOnClickListener {
            Toast.makeText(this, "Film was added", Toast.LENGTH_SHORT).show()
        }
    }
}
