package com.example.ejerciciorecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciorecyclerview.adapter.VideoJuegoAdapter

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ListaVideoJuegos.videoJuegosList
        setContentView(R.layout.activity_main)
        initRecyclerView()

    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.Videojuegos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VideoJuegoAdapter(ListaVideoJuegos.videoJuegosList)

        val recyclerViewHorizontal = findViewById<RecyclerView>(R.id.VideojuegosHorizontal)
        recyclerViewHorizontal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = VideoJuegoAdapter(ListaVideoJuegos.videoJuegosList)

    }


}