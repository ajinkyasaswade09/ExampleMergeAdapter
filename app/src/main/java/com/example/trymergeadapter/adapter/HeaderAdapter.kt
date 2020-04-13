package com.example.trymergeadapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.trymergeadapter.R
import kotlinx.android.synthetic.main.layout_header_footer_view.view.*

class HeaderAdapter(
        private var isHeaderVisible: Boolean, var context: Context, private val text: String,
        private val imageUrl: String
) : RecyclerView.Adapter<HeaderAdapter.HeaderViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_header_footer_view, parent, false)
        return HeaderViewViewHolder(view)
    }

    override fun getItemCount(): Int = if (isHeaderVisible) 1 else 0


    override fun onBindViewHolder(holder: HeaderViewViewHolder, position: Int) {
        if (isHeaderVisible) {
            holder.itemView.clHeader.visibility = View.VISIBLE
            Glide.with(context).load(imageUrl).into(holder.itemView.imageView)
            holder.itemView.tvTitle.text = text
        } else {
            holder.itemView.clHeader.visibility = View.GONE
        }
    }

    class HeaderViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}