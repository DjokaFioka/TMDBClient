package com.example.tmdbclient.presentation.di.core

import com.example.tmdbclient.data.db.ArtistDao
import com.example.tmdbclient.data.db.MovieDao
import com.example.tmdbclient.data.db.TvShowDao
import com.example.tmdbclient.data.repository.artist.datasource.ArtistLocalDatasource
import com.example.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDatasourceImpl
import com.example.tmdbclient.data.repository.movie.datasource.MovieLocalDatasource
import com.example.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDatasourceImpl
import com.example.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDatasource
import com.example.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDatasourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Djole on 31.05.2023..
 */
@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDatasource(movieDao: MovieDao): MovieLocalDatasource {
        return MovieLocalDatasourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDatasource(tvShowDao: TvShowDao): TvShowLocalDatasource {
        return TvShowLocalDatasourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDatasource(artistDao: ArtistDao): ArtistLocalDatasource {
        return ArtistLocalDatasourceImpl(artistDao)
    }

}