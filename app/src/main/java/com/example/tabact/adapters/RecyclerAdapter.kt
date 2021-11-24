package com.example.tabact.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tabact.R

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private val recycleList= arrayOf(
        "Cristiano Ronaldo",
        "Messi",
        "Neymar",
        "Isco",
        "Hazard",
        "Mbappe",
        "Hazard",
        "Ziyech",
        "Suarez",
        "Cristiano Ronaldo",
        "Messi",
        "Neymar",
        "Isco",
        "Hazard",
        "Mbappe",
        "Hazard",
        "Ziyech",
        "Suarez"
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        println("Parent: $parent View Type: $viewType")
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recycler_card_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        println("Holder : $holder position: $position")
        holder.itemTitle.text=recycleList[position]
    }

    override fun getItemCount(): Int {
        println("Item Count : ${recycleList.size}")
        return recycleList.size
    }
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemTitle:TextView = itemView.findViewById(R.id.recycler_text)
    }
}