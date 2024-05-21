package com.example.tmdbclient.data.repository.movie.datasource

import com.example.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

/**
 * Created by Djole on 30.05.2023..
 */
interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList> //vraca isto sto i getPopularMovies iz TMDBService
}