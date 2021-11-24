package com.example.tabact.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.tabact.R
import com.example.tabact.databinding.FragmentNewsBinding


class NewsFragment : Fragment() {
    private lateinit var binding:FragmentNewsBinding
    private lateinit var arrayAdapter: ArrayAdapter<*>

    private val list = arrayOf(
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
    ): View {
        binding= FragmentNewsBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var num=0
        binding.swipeRefresh.setOnRefreshListener {
            if (num<=8){
                num++
                val newArray=list.copyOfRange(0,num)
                arrayAdapter = ArrayAdapter(
                    requireContext(),
                    R.layout.listview_support_textview, newArray
                )
                binding.listViewId.adapter=arrayAdapter
                binding.swipeRefresh.isRefreshing = false
            }else{
                num=0
                arrayAdapter = ArrayAdapter(
                    requireContext(),
                    R.layout.listview_support_textview, list
                )
                binding.listViewId.adapter=arrayAdapter
                num++
                binding.swipeRefresh.isRefreshing = false
            }
        }

    }
}