package com.example.lolfinfo.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lolfinfo.R

class ChampionAdapter(private val champions: List<Champion>) :
    RecyclerView.Adapter<ChampionAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_champion, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindViewHolder(champions[position])
    }

    override fun getItemCount(): Int = champions.size

    class ItemViewHolder(root: View) : RecyclerView.ViewHolder(root) {

        private val textViewName = root.findViewById<TextView>(R.id.textViewName)
        private val textViewHealth = root.findViewById<TextView>(R.id.textViewHealth)

        fun bindViewHolder(champion: Champion) {
            textViewName.text = champion.name
            textViewHealth.text = champion.health.toString()
        }

    }
}