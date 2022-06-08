package com.example.crushmovies.views.presenters.model

import android.net.Uri
import java.io.File
import java.io.Serializable


data class FilesDTO(
    val Actors: String?,
    val Awards: String?,
    val BoxOffice: String?,
    val Country: String?,
    val DVD: String?,
    val Director: String?,
    val Genre: String?,
    val Language: String?,
    val Metascore: String?,
    val Plot: String?,
    val Poster: Uri?,
    val Production: String?,
    val Rated: String?,
    val Ratings: List<Rating>?,
    val Released: String?,
    val Response: String?,
    val Runtime: String?,
    val Title: String?,
    val Type: String?,
    val Website: String?,
    val Writer: String?,
    val Year: String?,
    val imdbID: String?,
    val imdbRating: String?,
    val imdbVotes: String?
):Serializable