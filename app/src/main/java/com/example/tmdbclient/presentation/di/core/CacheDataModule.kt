package com.example.tmdbclient.presentation.di.core

import com.example.tmdbclient.data.repository.artist.datasource.ArtistCacheDatasource
import com.example.tmdbclient.data.repository.artist.datasourceImpl.ArtistCacheDatasourceImpl
import com.example.tmdbclient.data.repository.movie.datasource.MovieCacheDatasource
import com.example.tmdbclient.data.repository.movie.datasourceImpl.MovieCacheDatasourceImpl
import com.example.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDatasource
import com.example.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowCacheDatasourceImpl
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
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDatasource(): MovieCacheDatasource {
        return MovieCacheDatasourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDatasource(): TvShowCacheDatasource {
        return TvShowCacheDatasourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDatasource(): ArtistCacheDatasource {
        return ArtistCacheDatasourceImpl()
    }

}