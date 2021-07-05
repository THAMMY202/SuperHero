package com.immedia.superhero.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.immedia.superhero.R
import com.immedia.superhero.model.SuperHero

internal class SuperHeroAdapter(private var itemsList: List<SuperHero>) :
    RecyclerView.Adapter<SuperHeroAdapter.MyViewHolder>() {

    var context: Context? = null

    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var itemTextView: TextView = view.findViewById(R.id.tv_super_hero_name)
        var itemImageView: ImageView = view.findViewById(R.id.iv_super_hero_photo)
    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.super_hero_row, parent, false)

        context = parent.context

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]
        holder.itemTextView.text = item.name

        if (item.photo !== null) {
            context?.let {
                Glide.with(it)
                    .load(item.photo)
                    .fitCenter()
                    .into(holder.itemImageView)
            }
        } else {
            holder.itemImageView.setImageResource(R.drawable.ic_launcher_background)
        }

        holder.itemImageView.setOnClickListener {
            Toast.makeText(context, item.name, Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}