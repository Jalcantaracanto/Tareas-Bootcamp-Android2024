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

//    private fun setDownloadPokemonImage(pokemon: Pokemon){
//
//        binding.pbImg.visibility = View.VISIBLE
//        Glide.with(this).load(pokemon.imageUrl).listener(object : RequestListener<Drawable> {
//            override fun onLoadFailed(
//                e: GlideException?,
//                model: Any?,
//                target: Target<Drawable>,
//                isFirstResource: Boolean
//            ): Boolean {
//                binding.pbImg.visibility = View.GONE
//                binding.imgPokemon.setImageResource(R.drawable.ic_image_not_supported_black)
//                return false
//            }
//
//            override fun onResourceReady(
//                resource: Drawable,
//                model: Any,
//                target: Target<Drawable>?,
//                dataSource: DataSource,
//                isFirstResource: Boolean
//            ): Boolean {
//                binding.pbImg.visibility = View.GONE
//                return false
//            }
//        })
//            .error(R.drawable.ic_image_not_supported_black)
//            .into(binding.imgPokemon);
//    }

    // https://image.tmdb.org/t/p/w154/9bIvXIAf2i7NRMnrGowMhJJzPuY.jpg
}