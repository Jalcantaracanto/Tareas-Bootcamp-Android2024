package com.example.appmovieskotlin.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appmovieskotlin.databinding.ItemMoviesBinding
import com.example.appmovieskotlin.entities.Movie
import com.example.appmovieskotlin.fragments.HomePage

private val TAG = MovieAdapter::class.java.simpleName

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    lateinit var onItemClickListener: (Movie) -> Unit

    //Class Atribute
    var movies = mutableListOf<Movie>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.MovieViewHolder {

        val bindingItem =
            ItemMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(bindingItem)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val movie: Movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    inner class MovieViewHolder(private var bindingItem: ItemMoviesBinding) :
        RecyclerView.ViewHolder(bindingItem.root) {
        fun bind(movie: Movie) {

            with(movie) {
                Glide.with(bindingItem.root.context.applicationContext)
                    .load(poster)
                    .override(200, 300)
                    .into(bindingItem.posterMovie)
                bindingItem.titleMovie.text = title
                bindingItem.yearMovie.text = year
                bindingItem.categoryMovie.text = category.joinToString(", ")
                bindingItem.durationMovie.text = "Duración: $duration min"

            }


        }
    }

}