package com.example.tmdbclient.domain.repository

import com.example.tmdbclient.data.model.artist.Artist

/**
 * Created by Djole on 30.05.2023..
 */
interface ArtistRepository {

    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}