package com.ezgieren.flixmoviedbverse.utils

import com.ezgieren.flixmoviedbverse.BuildConfig

object Constants {
    const val BASE_URL = BuildConfig.BASE_URL
    const val API_KEY = BuildConfig.API_KEY

    // Database
    object Database {
        const val MOVIES_TABLE = "movies"
        const val DATABASE_NAME = "flixmoviedbverse_db"
    }

    object QueryConstants {
        const val SELECT_ALL_MOVIES = "SELECT * FROM movies"
        const val DELETE_ALL_MOVIES = "DELETE FROM movies"
    }

    // Endpoints
    object Endpoints {
        const val POPULAR_MOVIES = "movie/popular"
        const val MOVIE_DETAILS = "movie/{movie_id}"
    }

    // Error Messages
    object ErrorMessages {
        const val FETCHING_DATA = "An error occurred while fetching data."
        const val NO_MOVIES = "No movies available."
        const val GENERIC_ERROR = "Something went wrong. Please try again later."
        fun detailedError(code: Int, message: String): String {
            return "Error Code: $code, Message: $message"
        }
    }

    // General Messages
    object GeneralMessages {
        const val LOADING = "Loading movies..."
        const val DETAILS = "\nDetails:"
    }
}