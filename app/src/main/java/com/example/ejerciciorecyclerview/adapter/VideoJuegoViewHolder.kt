package com.example.ejerciciorecyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ejerciciorecyclerview.R
import com.example.ejerciciorecyclerview.VideoJuegos

class VideoJuegoViewHolder (view: View):RecyclerView.ViewHolder(view) {
    val VideoJuegos = view.findViewById<TextView>(R.id.tvVideoJuego)
    val marcaName = view.findViewById<TextView>(R.id.tvMarcaName)
    val photo = view.findViewById<ImageView>(R.id.ivVideoJuego)

    fun render(superMotoModel: VideoJuegos){
        VideoJuegos.text = superMotoModel.videoJuego
        marcaName.text = superMotoModel.company
        Glide.with(photo.context).load(superMotoModel.photo).into(photo)


    }
}