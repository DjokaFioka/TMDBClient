package com.example.tmdbclient.domain.repository

import com.example.tmdbclient.data.model.movie.Movie

/**
 * Created by Djole on 30.05.2023..
 */
interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}