package com.example.tmdbclient.data.repository.movie.datasourceImpl

import com.example.tmdbclient.data.model.movie.Movie
import com.example.tmdbclient.data.repository.movie.datasource.MovieCacheDatasource

/**
 * Created by Djole on 30.05.2023..
 */
class MovieCacheDatasourceImpl : MovieCacheDatasource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}