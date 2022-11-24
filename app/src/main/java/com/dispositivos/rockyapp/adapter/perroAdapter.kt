package com.dispositivos.rockyapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dispositivos.rockyapp.R
import com.dispositivos.rockyapp.perro
// el valor de la lista es determinate


//xq el private val xq la lista se va a utilizar durante el proyecto

class perroAdapter (private val perroList: List<perro>): RecyclerView.Adapter<perroViewHolder>(){


// devuelve el item que creamos en adapter y lo devolvemos acapor cada objeto de la lista
//utilizamos la vista de android llamada parent y esta el contexto

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): perroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return perroViewHolder(layoutInflater.inflate(R.layout.iten_perro, parent, false))

    }




    override fun onBindViewHolder(holder: perroViewHolder, position: Int) {

        val item = perroList[position]
        holder.llamado(item)

    }




// esta devuele el tamaño de la lista ,se puede igualar a un numero pero deve ser exacto a la lista
    //si no no funciona #< no funciona  #> no carga
    override fun getItemCount(): Int = perroList.size


}