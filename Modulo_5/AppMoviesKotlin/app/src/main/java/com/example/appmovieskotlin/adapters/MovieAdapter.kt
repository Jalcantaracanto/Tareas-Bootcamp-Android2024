package com.example.appmovieskotlin.adapters

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.example.appmovieskotlin.R
import com.example.appmovieskotlin.databinding.ItemMoviesBinding
import com.example.appmovieskotlin.model.Movie

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

    inner class MovieViewHolder(var bindingItem: ItemMoviesBinding) :
        RecyclerView.ViewHolder(bindingItem.root) {
        fun bind(movie: Movie) {

            with(movie) {
                bindingItem.posterMovie.visibility = View.VISIBLE


                Glide.with(bindingItem.root.context.applicationContext)
                    .load(poster).listener(object : RequestListener<Drawable> {
                        override fun onLoadFailed(
                            e: GlideException?,
                            model: Any?,
                            target: com.bumptech.glide.request.target.Target<Drawable>?,
                            isFirstResource: Boolean
                        ): Boolean {
                            bindingItem.posterMovie.setImageResource(R.drawable.empty_case)
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
                    .into(bindingItem.posterMovie)

                bindingItem.titleMovie.text = title
                bindingItem.yearMovie.text = year
                bindingItem.categoryMovie.text = category.joinToString(", ")
                bindingItem.durationMovie.text = "Duración: $duration min"
                bindingItem.descriptionMovie.text = overview

                bindingItem.btnDetail.setOnClickListener() {
                    if (::onItemClickListener.isInitialized)
                        onItemClickListener(movie)
                    else {
                        Log.e(TAG, "onItemClickList is not initialized")
                    }
                }

            }

        }


    }

}