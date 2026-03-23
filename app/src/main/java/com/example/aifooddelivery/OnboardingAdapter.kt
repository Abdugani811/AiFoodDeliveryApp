package com.example.aifooddelivery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardingAdapter(
    private val list: List<OnboardingItem>,
    private val listener: OnItemClick
) : RecyclerView.Adapter<OnboardingAdapter.ViewHolder>() {

    interface OnItemClick {
        fun onNextClick(position: Int)
        fun onSkipClick()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.image)
        val title: TextView = view.findViewById(R.id.title)
        val desc: TextView = view.findViewById(R.id.desc)
        val next: TextView = view.findViewById(R.id.next)
        val skip: TextView = view.findViewById(R.id.skip)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.onboarding_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = list[position]

        holder.image.setImageResource(item.image)
        holder.title.text = item.title
        holder.desc.text = item.description

        holder.next.setOnClickListener {
            listener.onNextClick(position)
        }

        holder.skip.setOnClickListener {
            listener.onSkipClick()
        }
    }
}