package com.dispositivos.rockyapp.adapter

import android.view.LayoutInflater
//import xml android
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dispositivos.rockyapp.ClaseAyudaMascotas
import com.dispositivos.rockyapp.R


class AyudaMascotasAdapter(private val CentresAdoptionList:List<ClaseAyudaMascotas>) : RecyclerView.Adapter<AyudaMascotasViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AyudaMascotasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AyudaMascotasViewHolder(layoutInflater.inflate(R.layout.item_ayudamascota, parent, false))
    }

    override fun onBindViewHolder(holder: AyudaMascotasViewHolder, position: Int) {
        val item = CentresAdoptionList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = CentresAdoptionList.size
    }
