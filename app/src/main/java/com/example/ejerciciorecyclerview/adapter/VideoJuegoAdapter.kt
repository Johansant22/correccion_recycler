package com.example.ejerciciorecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.ejerciciorecyclerview.ListaVideoJuegos
import com.example.ejerciciorecyclerview.R
import com.example.ejerciciorecyclerview.VideoJuegos

class VideoJuegoAdapter (val listaVideoJuegos:List<VideoJuegos>) : RecyclerView.Adapter<VideoJuegoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoJuegoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return VideoJuegoViewHolder(layoutInflater.inflate(R.layout.item_videojuegos, parent, false ))
    }

    override fun onBindViewHolder(holder: VideoJuegoViewHolder, position: Int) {
        val item = listaVideoJuegos[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listaVideoJuegos.size

}
