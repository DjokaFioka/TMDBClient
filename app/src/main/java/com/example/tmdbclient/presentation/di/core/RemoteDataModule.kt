package com.example.tmdbclient.presentation.di.core

import com.example.tmdbclient.BuildConfig
import com.example.tmdbclient.data.api.TMDBService
import com.example.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDatasourceImpl
import com.example.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDatasourceImpl
import com.example.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDatasourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Djole on 31.05.2023..
 */
@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule() {

    private val apiKey = BuildConfig.API_KEY
    @Singleton
    @Provides
    fun provideMovieRemoteDatasource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDatasourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvRemoteDatasource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDatasourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDatasource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDatasourceImpl(tmdbService, apiKey)
    }
}
//Ovako je bilo sa Daggerom
//class RemoteDataModule(private val apiKey: String) {
//
//    @Singleton
//    @Provides
//    fun provideMovieRemoteDatasource(tmdbService: TMDBService): MovieRemoteDatasource {
//        return MovieRemoteDatasourceImpl(tmdbService, apiKey)
//    }
//
//    @Singleton
//    @Provides
//    fun provideTvRemoteDatasource(tmdbService: TMDBService): TvShowRemoteDatasource {
//        return TvShowRemoteDatasourceImpl(tmdbService, apiKey)
//    }
//
//    @Singleton
//    @Provides
//    fun provideArtistRemoteDatasource(tmdbService: TMDBService): ArtistRemoteDatasource {
//        return ArtistRemoteDatasourceImpl(tmdbService, apiKey)
//    }
//}