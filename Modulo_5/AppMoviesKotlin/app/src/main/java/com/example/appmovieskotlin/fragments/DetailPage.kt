package com.example.appmovieskotlin.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.example.appmovieskotlin.R
import com.example.appmovieskotlin.databinding.FragmentDetailPageBinding
import com.example.appmovieskotlin.entities.Movie

class DetailPage : Fragment() {

    private lateinit var binding: FragmentDetailPageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDetailPageBinding.inflate(inflater, container, false)

        val movie = arguments?.getParcelable<Movie>("movie")
        val imageUrl = arguments?.getString("imageUrl")

        Glide.with(this)
            .load(imageUrl)
            .into(binding.posterDetail)

        binding.titleMovieDescription.text = movie?.title
        binding.descriptionMovie.text = movie?.overview

        binding.btnVolver.setOnClickListener {
            requireActivity().onBackPressed()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}