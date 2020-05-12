package com.example.movieupload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieList : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        val movies = ArrayList<Movies>()

        movies.add(Movies("hello","http",2019))
        movies.add(Movies("sfsf","http",2018))

        val adapter = MovieAdapter(movies)
        recycle_movie.adapter=adapter
    }
}
