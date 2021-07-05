package com.immedia.superhero.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.immedia.superhero.R

class SuperHeroDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.super_hero_detail_activity)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}