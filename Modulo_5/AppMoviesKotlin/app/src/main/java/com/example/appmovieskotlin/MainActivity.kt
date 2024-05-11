package com.example.appmovieskotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.appmovieskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val imageUrl = "https://image.tmdb.org/t/p/w154/9bIvXIAf2i7NRMnrGowMhJJzPuY.jpg"
//
//        Glide.with(this)
//            .load(imageUrl)
//            .override(200, 300)
//            .into(binding.testGlide)
//

    }


    // https://image.tmdb.org/t/p/w154/9bIvXIAf2i7NRMnrGowMhJJzPuY.jpg
}