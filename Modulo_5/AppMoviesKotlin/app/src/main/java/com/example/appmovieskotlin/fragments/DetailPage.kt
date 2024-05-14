package com.example.appmovieskotlin.fragments

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.appmovieskotlin.R
import com.example.appmovieskotlin.databinding.FragmentDetailPageBinding
import com.example.appmovieskotlin.model.Movie

class DetailPage : Fragment() {

    private val args: DetailPageArgs by navArgs()
    private lateinit var binding: FragmentDetailPageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailPageBinding.inflate(inflater, container, false)

        val movie: Movie? = args.movie

        if (movie != null) {
            initUI(movie)
        }

        return binding.root
    }


    fun initUI(movie: Movie) {

        var isVisible = false

        binding.titleMovieDescription.text = movie.title
        binding.descriptionMovie.text = movie.overview

        binding.btnShare.setOnClickListener {
            sendEmailMovie(movie)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }

        binding.firstFloating.setOnClickListener {
            if (isVisible) {
                binding.secondFloating.visibility = View.GONE
                binding.secondFloatingText.visibility = View.GONE
                isVisible = false
            } else {
                binding.secondFloating.visibility = View.VISIBLE
                binding.secondFloatingText.visibility = View.VISIBLE
                isVisible = true
            }


        }

        binding.secondFloating.setOnClickListener {
            sendEmailMovie(movie)
        }

        setDownloadMovieImages(movie)
    }


    private fun sendEmailMovie(movie: Movie) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "message/rfc822"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("javier.alcantara.canto@gmail.com"))
        intent.putExtra(Intent.EXTRA_SUBJECT, "Movie Recommendation")

        intent.putExtra(
            Intent.EXTRA_TEXT,
            "I have a movie recommendation that we can watch: ${movie.title} and it has a duration of: ${movie.duration}" +
                    "The synopsis is \n" +
                    movie.overview
        )

        if (intent.resolveActivity(requireActivity().packageManager) != null) {
            startActivity(Intent.createChooser(intent, "Send email"))
        } else {
            Toast.makeText(requireContext(), "The email could not be sent", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun setDownloadMovieImages(movie: Movie) {
        Glide.with(this).load(movie.poster).listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: com.bumptech.glide.request.target.Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                binding.posterDetail.setImageResource(R.drawable.empty_case)
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: com.bumptech.glide.request.target.Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                return false
            }

        })
            .override(200, 300)
            .error(R.drawable.empty_case)
            .into(binding.posterDetail)
    }
}