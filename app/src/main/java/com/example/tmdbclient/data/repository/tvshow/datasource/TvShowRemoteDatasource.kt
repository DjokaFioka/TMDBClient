package com.example.tmdbclient.data.repository.tvshow.datasource

import com.example.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

/**
 * Created by Djole on 30.05.2023..
 */
interface TvShowRemoteDatasource {
    suspend fun getTvShows(): Response<TvShowList>
}