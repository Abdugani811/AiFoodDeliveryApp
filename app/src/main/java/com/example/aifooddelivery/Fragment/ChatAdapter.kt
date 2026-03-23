package com.example.aifooddelivery.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aifooddelivery.R

class ChatAdapter(private val list: List<Chat>) :
    RecyclerView.Adapter<ChatAdapter.VH>() {

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.chatImage)
        val name = itemView.findViewById<TextView>(R.id.nameTv)
        val chats = itemView.findViewById<TextView>(R.id.chatsTv)
        val time = itemView.findViewById<TextView>(R.id.timeTv)
        val read = itemView.findViewById<ImageView>(R.id.doubleCheck)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chat, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = list[position]
        holder.image.setImageResource(item.image)
        holder.name.text = item.name
        holder.chats.text = item.chats
        holder.time.text = item.time
        holder.read.setImageResource(item.read)

    }

    override fun getItemCount(): Int = list.size
}