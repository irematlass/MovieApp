package com.example.movieapp.data.api

import com.example.movieapp.data.vo.MovieDetails
import com.example.movieapp.data.vo.MovieResponse


import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {
    // https://api.themoviedb.org/3/movie/popular?api_key=455e7acbaf30d6d85012dc959ea1b7cf&page=1
    // https://api.themoviedb.org/3/movie/299534?api_key=455e7acbaf30d6d85012dc959ea1b7cf
    // https://api.themoviedb.org/3/
    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>
}