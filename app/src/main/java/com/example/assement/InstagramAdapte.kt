package com.example.assement

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class InstagramAdapte
    (private val data: List<data_model>) :
    RecyclerView.Adapter<InstagramAdapte.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewProfile: ImageView = itemView.findViewById(R.id.imageViewProfile)
        val textViewUsername: TextView = itemView.findViewById(R.id.textViewUsername)
        val imageViewMain: ImageView = itemView.findViewById(R.id.imageViewMain)
        val imageViewLike: ImageView = itemView.findViewById(R.id.imageViewLike)
        val textViewLikes: TextView = itemView.findViewById(R.id.textViewLikes)
        val imageViewComment: ImageView = itemView.findViewById(R.id.imageViewComment)
        val textViewComments: TextView = itemView.findViewById(R.id.textViewComments)
        val imageViewSave: ImageView = itemView.findViewById(R.id.imageViewSave)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = data[position]

        holder.imageViewProfile.setImageResource(currentItem.profileImage)
        holder.textViewUsername.text = currentItem.username
        holder.imageViewMain.setImageResource(currentItem.mainImage)
        holder.textViewLikes.text = currentItem.likes.toString()
        holder.textViewComments.text = currentItem.comments.toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
