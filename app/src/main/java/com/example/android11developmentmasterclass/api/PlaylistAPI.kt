package com.example.android11developmentmasterclass.api

import com.example.android11developmentmasterclass.data.model.PlaylistResponse
import retrofit2.http.GET

interface PlaylistAPI {

    @GET("playlists")
    suspend fun fetchAllPlaylists(): List<PlaylistResponse>

}