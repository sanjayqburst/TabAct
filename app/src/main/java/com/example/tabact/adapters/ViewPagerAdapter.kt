package com.example.tabact.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabact.fragments.FavouritesFragment
import com.example.tabact.fragments.NewsFragment
import com.example.tabact.fragments.SettingsFragment

class ViewPagerAdapter(private val count:Int, fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return count
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> NewsFragment()
            1 -> FavouritesFragment()
            2 -> SettingsFragment()
            else -> Fragment()
        }
    }

}