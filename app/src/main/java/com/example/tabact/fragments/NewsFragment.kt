package com.example.tabact.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.tabact.MainActivity
import com.example.tabact.R
import com.example.tabact.databinding.FragmentNewsBinding


class NewsFragment : Fragment() {
    private lateinit var binding:FragmentNewsBinding
    private lateinit var arrayAdapter: ArrayAdapter<*>

    val list = arrayOf(
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentNewsBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arrayAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1, list
        )
        binding.listViewId.adapter=arrayAdapter
    }
}