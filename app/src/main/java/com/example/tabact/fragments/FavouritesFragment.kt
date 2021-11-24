package com.example.tabact.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tabact.R.drawable
import com.example.tabact.adapters.GridAdapter
import com.example.tabact.databinding.FragmentFavouritesBinding


class FavouritesFragment : Fragment() {
    private lateinit var binding: FragmentFavouritesBinding

    private val imageList= arrayOf(drawable.a1,drawable.a2,drawable.a3,drawable.a4,drawable.a5,drawable.a6,drawable.a7,drawable.a8,drawable.a9)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentFavouritesBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter=GridAdapter(imageList)
        binding.gridView.adapter=adapter
    }

}