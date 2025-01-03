package com.ezgieren.flixmoviedbverse.di

import com.ezgieren.flixmoviedbverse.data.repository.MovieRepositoryImpl
import com.ezgieren.flixmoviedbverse.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieRepository(
        movieRepositoryImpl: MovieRepositoryImpl
    ): MovieRepository
}