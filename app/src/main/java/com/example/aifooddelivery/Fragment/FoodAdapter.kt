package com.example.aifooddelivery.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aifooddelivery.R

class FoodAdapter(private val list: List<Food>) :
    RecyclerView.Adapter<FoodAdapter.VH>() {

    private var listener: OnItemClick? = null

    interface OnItemClick {
        fun onClick(food: Food)
    }

    fun setOnItemClickListener(listener: OnItemClick) {
        this.listener = listener
    }

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.imageView)
        val title = itemView.findViewById<TextView>(R.id.titleBurgerTv)
        val rate = itemView.findViewById<TextView>(R.id.rateTv)
        val location = itemView.findViewById<TextView>(R.id.locTv)
        val price = itemView.findViewById<TextView>(R.id.priceTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.VH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category_card, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = list[position]

        holder.image.setImageResource(item.image)
        holder.title.text = item.title
        holder.rate.text = item.rate
        holder.location.text = item.loc
        holder.price.text = item.price

        // 🔥 CLICK
        holder.itemView.setOnClickListener {
            listener?.onClick(item)
        }
    }

    override fun getItemCount(): Int = list.size
}