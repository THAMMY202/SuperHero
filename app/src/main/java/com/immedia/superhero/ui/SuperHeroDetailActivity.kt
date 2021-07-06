package com.immedia.superhero.ui

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.immedia.superhero.R

class SuperHeroDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.super_hero_detail_activity)
        setSupportActionBar(findViewById(R.id.toolbar))

        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val photo = intent.getStringExtra("photo")
        val isAvenger = intent.getBooleanExtra("isAvenger", true)

        var heroNameTextView: TextView = findViewById(R.id.tv_super_hero_name)
        var heroDescriptionTextView: TextView = findViewById(R.id.tv_super_hero_description)
        var heroImageView: ImageView = findViewById(R.id.iv_super_hero_photo)
        var heroAvengersBadgeImageView: ImageView = findViewById(R.id.iv_avengers_badge)

        heroNameTextView.text = name
        heroDescriptionTextView.text = description

        val avengersBadgeVisibility = if (isAvenger) View.VISIBLE else View.GONE
        heroAvengersBadgeImageView.visibility = avengersBadgeVisibility

        if (photo !== null) {
            applicationContext?.let {
                Glide.with(it)
                        .load(photo)
                        .fitCenter()
                        .into(heroImageView)
            }
        } else {
            heroImageView.setImageResource(R.drawable.ic_launcher_background)
        }

    }
}