package com.ezgieren.flixmoviedbverse.data.model

import com.google.gson.annotations.SerializedName

data class MovieDetails(
    @SerializedName("adult") val adult: Boolean,
    @SerializedName("backdrop_path") val backdropPath: String?,
    @SerializedName("budget") val budget: Int,
    @SerializedName("genres") val genres: List<Genre>,
    @SerializedName("language") val language: List<SpokenLanguage>,
    @SerializedName("homepage") val homepage: String?,
    @SerializedName("id") val id: Int,
    @SerializedName("imdb_id") val imdbId: String?,
    @SerializedName("original_language") val originalLanguage: String,
    @SerializedName("original_title") val originalTitle: String,
    @SerializedName("overview") val overview: String?,
    @SerializedName("popularity") val popularity: Double,
    @SerializedName("poster_path") val posterPath: String?,
    @SerializedName("release_date") val releaseDate: String?,
    @SerializedName("revenue") val revenue: Int,
    @SerializedName("runtime") val runtime: Int?,
    @SerializedName("spoken_languages") val spokenLanguages: List<SpokenLanguage>,
    @SerializedName("status") val status: String?,
    @SerializedName("tagline") val tagline: String?,
    @SerializedName("title") val title: String,
    @SerializedName("vote_average") val voteAverage: Double,
    @SerializedName("vote_count") val voteCount: Int
)

