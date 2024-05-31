package com.example.ejerciciorecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ejerciciorecyclerview.R
import com.example.ejerciciorecyclerview.VideoJuegos

class VideoJuegoHorizontalAdapter(private val supermotosList: List<VideoJuegos>) :
    RecyclerView.Adapter<VideoJuegoHorizontalAdapter.SuperMotosViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperMotosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_videojuegos_horizontal, parent, false)
        return SuperMotosViewHolder(view)
    }
    class SuperMotosViewHolder (view: View): RecyclerView.ViewHolder(view){

        val superMotos = view.findViewById<TextView>(R.id.tvVideoJuego)
        val marcaName = view.findViewById<TextView>(R.id.tvMarcaName)
        val photo = view.findViewById<ImageView>(R.id.ivVideoJuego)

        fun render(superMotoModel: VideoJuegos){
            superMotos.text = superMotoModel.videoJuego
            marcaName.text = superMotoModel.company
            Glide.with(photo.context).load(superMotoModel.photo).into(photo)


        }
    }

    override fun onBindViewHolder(holder: SuperMotosViewHolder, position: Int) {
        val item = supermotosList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return supermotosList.size
    }

}