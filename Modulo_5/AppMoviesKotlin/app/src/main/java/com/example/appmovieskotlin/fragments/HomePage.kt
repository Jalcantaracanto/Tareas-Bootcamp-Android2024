package com.example.appmovieskotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmovieskotlin.R
import com.example.appmovieskotlin.adapters.MovieAdapter
import com.example.appmovieskotlin.databinding.FragmentHomePageBinding
import com.example.appmovieskotlin.entities.Movie


class HomePage : Fragment() {

    private lateinit var binding: FragmentHomePageBinding

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


    fun initAdapter() {

        val linearLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerMoviesList.layoutManager = linearLayoutManager

        val movieAdapter = MovieAdapter()
        movieAdapter.movies = Movie.dataMovies
        binding.recyclerMoviesList.adapter = movieAdapter
        binding.recyclerMoviesList.adapter = movieAdapter

//
//        val transferenciaAdapter = TransferenciaAdapter()
//        transferenciaAdapter.transferencias = Transferencia.dataTransferencias
//        binding.recyclerTransferencias.adapter = transferenciaAdapter

    }
}