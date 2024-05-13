package com.example.appmovieskotlin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.appmovieskotlin.databinding.FragmentDetailPageBinding
import com.example.appmovieskotlin.model.Movie

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

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }


        binding.btnShare.setOnClickListener {
            sendEmailMovie(movie!!)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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


}