package com.example.modul2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.template,
    parent, false)) {
    private var image : ImageView? = null
    private var text1 : TextView ? = null
    private var text2 : TextView ? = null

    init{
        image = itemView.findViewById(R.id.image)
        text1 = itemView.findViewById(R.id.text1)
        text2 = itemView.findViewById(R.id.text2)
    }

    fun bind(data : wisatakuku){
        image?.setImageResource(data.image)
        text1?.text = data.text1
        text2?.text = data.text2
    }
}