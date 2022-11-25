package com.dispositivos.rockyapp.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dispositivos.rockyapp.databinding.ItenPerroBinding
import com.dispositivos.rockyapp.perro


class perroViewHolder (view:View):RecyclerView.ViewHolder(view){

    val binding = ItenPerroBinding.bind(view)




   fun llamado(perroModelo: perro){
       binding.tvPerroName.text = perroModelo.perro
       binding.tvRealName.text = perroModelo.realName
       binding.tvPublisher.text = perroModelo.publisher
       Glide.with(binding.ivPerro.context).load(perroModelo.photo).into(binding.ivPerro)

       // gestionar los clicks

       binding.ivPerro.setOnClickListener { Toast.makeText(binding.ivPerro.context,
                                                           perroModelo.realName,
                                                           Toast.LENGTH_SHORT
                                                             ).show()
       }

       itemView.setOnClickListener {  Toast.makeText(
           binding.ivPerro.context,
           perroModelo.perro,
           Toast.LENGTH_SHORT
       ).show() }

   }
}