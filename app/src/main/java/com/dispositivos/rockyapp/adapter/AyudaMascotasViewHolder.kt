package com.dispositivos.rockyapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.dispositivos.rockyapp.ClaseAyudaMascotas
import com.dispositivos.rockyapp.R

class AyudaMascotasViewHolder (view:View):ViewHolder(view){

    val Nombreayuda = view.findViewById<TextView>(R.id.tvcentroadopcion1)
    val Descripcion = view.findViewById<TextView>(R.id.tvdescripcion)
    val Direccion = view.findViewById<TextView>(R.id.tvDireccion)
    val photo = view.findViewById<ImageView>(R.id.ivCentroAdopcion1)


    fun render(claseAyudaMascotasModel: ClaseAyudaMascotas){
        Nombreayuda.text = claseAyudaMascotasModel.nombreayuda
        Descripcion.text = claseAyudaMascotasModel.descripcion
        Direccion.text = claseAyudaMascotasModel.direccion

    }

}