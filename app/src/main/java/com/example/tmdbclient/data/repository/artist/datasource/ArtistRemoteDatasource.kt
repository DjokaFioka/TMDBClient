package com.example.tmdbclient.data.repository.artist.datasource

import com.example.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

/**
 * Created by Djole on 30.05.2023..
 */
interface ArtistRemoteDatasource {
    suspend fun getArtists(): Response<ArtistList>
}