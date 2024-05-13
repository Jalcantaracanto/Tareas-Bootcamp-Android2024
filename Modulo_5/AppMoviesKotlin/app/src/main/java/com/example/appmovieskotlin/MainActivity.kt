package com.example.appmovieskotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.example.appmovieskotlin.databinding.ActivityMainBinding
import com.example.appmovieskotlin.fragments.HomePage
import com.example.appmovieskotlin.fragments.HomePageDirections
import com.example.appmovieskotlin.model.Movie

class MainActivity : AppCompatActivity(), HomePage.MovieSelectListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onMovieSelected(movie: Movie) {
        findNavController(R.id.navigation_container).navigate(HomePageDirections.actionHomePageToDetailPage(movie))
    }

}