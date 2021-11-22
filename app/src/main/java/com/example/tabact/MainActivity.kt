package com.example.tabact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import com.example.tabact.adapters.ViewPagerAdapter
import com.example.tabact.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        val tabTitle= arrayOf("News","Favourites","Settings")
        val tabIcons= arrayOf(R.drawable.news,R.drawable.favourites,R.drawable.settings)

        setContentView(binding.root)
        title="News app"


        binding.viewPager.adapter=ViewPagerAdapter(binding.tabLayout.tabCount,supportFragmentManager,lifecycle)
        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position->
            tab.icon=AppCompatResources.getDrawable(this,tabIcons[position])
            tab.text=tabTitle[position]
        }.attach()

    }
}