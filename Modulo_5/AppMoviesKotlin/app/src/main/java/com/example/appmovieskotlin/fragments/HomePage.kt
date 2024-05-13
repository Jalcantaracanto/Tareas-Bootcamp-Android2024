package com.example.appmovieskotlin.fragments

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.appmovieskotlin.R
import com.example.appmovieskotlin.adapters.MovieAdapter
import com.example.appmovieskotlin.databinding.FragmentHomePageBinding
import com.example.appmovieskotlin.model.Movie


class HomePage : Fragment() {

    interface MovieSelectListener {
        fun onMovieSelected(movie: Movie)
    }

    private lateinit var binding: FragmentHomePageBinding
    private lateinit var movieSelectListener: MovieSelectListener


    override fun onAttach(context: Context) {
        super.onAttach(context)
        movieSelectListener = try {
            context as MovieSelectListener
        } catch (e: ClassCastException) {
            throw ClassCastException("$context must implement MovieSelectListener")
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
        initAdapter()
        return binding.root

    }


    private fun initAdapter() {
        val linearLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerMoviesList.layoutManager = linearLayoutManager

        val movieAdapter = MovieAdapter()
        movieAdapter.movies = Movie.dataMovies
        binding.recyclerMoviesList.adapter = movieAdapter

        movieAdapter.onItemClickListener = {
            movieSelectListener.onMovieSelected(it)
        }

    }

}