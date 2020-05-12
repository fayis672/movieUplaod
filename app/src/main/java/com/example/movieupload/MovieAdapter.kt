package com.example.movieupload

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(val movieList:ArrayList<Movies>): RecyclerView.Adapter<MovieAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val v= LayoutInflater.from(parent.context).inflate(R.layout.card_movie,parent,false)
        return Holder(v)

    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val movie = movieList.get(position)
        holder.name.text=movie.name
        holder.year.text=movie.Year.toString()
    }

    class Holder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        val name = itemView.findViewById<TextView>(R.id.name)
        val year = itemView.findViewById<TextView>(R.id.year)

    }

}