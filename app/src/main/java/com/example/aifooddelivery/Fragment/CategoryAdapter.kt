package com.example.aifooddelivery.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aifooddelivery.R

class CategoryAdapter(private val list: List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.VH>() {

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.imageView)
        val txt = itemView.findViewById<TextView>(R.id.titleTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category_home, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = list[position]
        holder.img.setImageResource(item.image)
        holder.txt.text = item.name
    }

    override fun getItemCount(): Int = list.size
}