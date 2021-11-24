package com.example.tabact.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.tabact.databinding.GridviewSupportBinding.inflate

class GridAdapter( private val imgArray:Array<Int>):BaseAdapter() {
    override fun getCount(): Int {
        return imgArray.size
    }

    override fun getItem(position: Int): Any {
        return imgArray[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater=parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        val binding= inflate(inflater)
        val view=binding.root
        binding.cardImg.setImageResource(imgArray[position])
        return view
    }
}