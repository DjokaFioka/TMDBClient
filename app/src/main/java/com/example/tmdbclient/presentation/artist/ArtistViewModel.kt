package com.example.tmdbclient.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbclient.domain.usecase.GetArtistsUseCase
import com.example.tmdbclient.domain.usecase.UpdateArtistsUseCase

/**
 * Created by Djole on 31.05.2023..
 */
class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
): ViewModel() {

    fun getMovies() = liveData {
        val artistList = getArtistsUseCase.execute()
        emit(artistList)
    }

    fun updateMovies() = liveData {
        val artistList = updateArtistsUseCase.execute()
        emit(artistList)
    }
}