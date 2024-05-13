package com.example.appmovieskotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmovieskotlin.R
import com.example.appmovieskotlin.adapters.MovieAdapter
import com.example.appmovieskotlin.databinding.FragmentHomePageBinding
import com.example.appmovieskotlin.model.Movie


class HomePage : Fragment() {

    private lateinit var binding: FragmentHomePageBinding
    private val movieAdapter = MovieAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)
        initAdapter()
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)
        movieAdapter.onItemClickListener = { movie ->
            Toast.makeText(requireContext(), movie.title, Toast.LENGTH_SHORT).show()

            val bundle = Bundle().apply {
                putParcelable("movie", movie)
                putString("imageUrl", movie.poster)
            }

            navController.navigate(R.id.action_homePage_to_detailPage, bundle)
        }


    }


    fun initAdapter() {
        val linearLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerMoviesList.layoutManager = linearLayoutManager

        movieAdapter.movies = Movie.dataMovies
        binding.recyclerMoviesList.adapter = movieAdapter

    }

}