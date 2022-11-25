package com.dispositivos.rockyapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dispositivos.rockyapp.R
import com.dispositivos.rockyapp.perro


class perroViewHolder (view:View):RecyclerView.ViewHolder(view){

    val perro = view.findViewById<TextView>(R.id.tvPerroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivPerro)


   fun llamado(perroModelo: perro){
       perro.text = perroModelo.perro
       realName.text = perroModelo.realName
       publisher.text = perroModelo.publisher
       Glide.with(photo.context).load(perroModelo.photo).into(photo)



   }
}