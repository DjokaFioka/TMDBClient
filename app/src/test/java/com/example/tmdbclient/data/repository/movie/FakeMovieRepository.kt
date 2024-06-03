package com.example.tmdbclient.data.repository.movie

import com.example.tmdbclient.data.model.movie.Movie
import com.example.tmdbclient.domain.repository.MovieRepository

class FakeMovieRepository : MovieRepository {
    private val movies = mutableListOf<Movie>()

    init {
        movies.add(Movie(1, "overview 1", "posterPath 1", "date 1", "Title 1"))
        movies.add(Movie(2, "overview 2", "posterPath 2", "date 2", "Title 2"))
        movies.add(Movie(3, "overview 3", "posterPath 3", "date 3", "Title 3"))
    }
    override suspend fun getMovies(): List<Movie>? {
        return movies
    }

    override suspend fun updateMovies(): List<Movie>? {
        movies.clear()
        movies.add(Movie(4, "overview 4", "posterPath 4", "date 4", "Title 4"))
        movies.add(Movie(5, "overview 5", "posterPath 5", "date 5", "Title 5"))
        movies.add(Movie(6, "overview 6", "posterPath 6", "date 6", "Title 6"))

        return movies
    }
}