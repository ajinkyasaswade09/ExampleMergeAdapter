package com.example.trymergeadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trymergeadapter.R
import com.example.trymergeadapter.model.Model
import kotlinx.android.synthetic.main.view_item.view.*

class ListAdapter(private val modelList: MutableList<Model>) :
        RecyclerView.Adapter<ListAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_item, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return modelList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val contactModel = modelList[position]
        holder.itemView.tvTitle.text = contactModel.name
        holder.itemView.tvDetails.text = contactModel.number.toString()
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}