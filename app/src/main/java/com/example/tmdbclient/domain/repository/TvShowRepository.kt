package com.example.tmdbclient.domain.repository

import com.example.tmdbclient.data.model.tvshow.TvShow

/**
 * Created by Djole on 30.05.2023..
 */
interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}