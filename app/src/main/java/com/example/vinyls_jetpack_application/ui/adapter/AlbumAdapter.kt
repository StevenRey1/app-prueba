package com.example.vinyls_jetpack_application.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vinyls_jetpack_application.models.Album
import com.example.vinyls_jetpack_application.databinding.AlbumItemBinding


class AlbumAdapter(private var albums: List<Album>) : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {

    class AlbumViewHolder(private val binding: AlbumItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(album: Album) {
            binding.album = album
            binding.executePendingBindings() // Asegurar que los cambios se reflejen en la vista
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.bind(albums[position])
    }

    override fun getItemCount(): Int = albums.size

    fun updateAlbums(newAlbums: List<Album>) {
        albums = newAlbums
        notifyDataSetChanged()
    }
}
