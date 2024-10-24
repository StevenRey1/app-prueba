package com.example.vinyls_jetpack_application.repository

import android.content.Context
import com.android.volley.VolleyError
import com.example.vinyls_jetpack_application.models.Album
import com.example.vinyls_jetpack_application.network.NetworkServiceAdapter

class AlbumRepository(private val context: Context) {

    private val networkService = NetworkServiceAdapter.getInstance(context)

    // Función para obtener la lista de álbumes
    fun getAlbumCatalog(onComplete: (List<Album>) -> Unit, onError: (VolleyError) -> Unit) {
        networkService.getAlbums(onComplete, onError)
    }

    // Función para obtener el detalle de un álbum por ID
    fun getAlbumDetail(albumId: Int, onComplete: (Album?) -> Unit, onError: (VolleyError) -> Unit) {
        networkService.getAlbumDetail(albumId, onComplete, onError)
    }
}
