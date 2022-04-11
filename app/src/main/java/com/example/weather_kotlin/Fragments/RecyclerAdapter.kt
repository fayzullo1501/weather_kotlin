package com.example.weather_kotlin.Fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weather_kotlin.R

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf("Минск", "Брест", "Гродно", "Витебск", "Полоцк", "Гомель", "Могилёв", "Пинск", "Лепель", "Глубокое")

    private var details = arrayOf("+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",
        "+1C, Влажность: 81%, Ветер: 27 км/ч",)

    private val images = intArrayOf(R.drawable.image,
        R.drawable.brest,
        R.drawable.grodno,
        R.drawable.vitebsk,
        R.drawable.polock,
        R.drawable.gomel,
        R.drawable.mogilyov,
        R.drawable.pinsk,
        R.drawable.lepel,
        R.drawable.glubokoe,)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)
        }
    }
}