package com.friska.projekmobilemi2a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.friska.projekmobilemi2a.adapter.BukuAdapter
import com.friska.projekmobilemi2a.model.ModelBuku

class RecycleViewActivity : AppCompatActivity() {

    private lateinit var rv_data : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rv_data = findViewById(R.id.rv_data)

        //kita bikin array data
        val listBuku = listOf(
            ModelBuku(judul = "Buku Matematika", penerbit = "Friska"),
            ModelBuku(judul = "Buku Bahasa Indonesi", penerbit = "Anjelina"),
            ModelBuku(judul = "Buku PPKN", penerbit = "Putri"),
            ModelBuku(judul = "Buku Sejarah", penerbit = "Niken"),
            ModelBuku(judul = "Buku Agama", penerbit = "Ayu"),

            )
        val nBukuAdapter = BukuAdapter(listBuku)
        rv_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleViewActivity)
            adapter = nBukuAdapter
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}