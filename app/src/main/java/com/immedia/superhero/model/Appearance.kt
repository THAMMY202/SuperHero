package com.immedia.superhero.model

import com.google.gson.annotations.SerializedName

data class Appearance (

	val gender : String,
	val race : String,
	val height : List<String>,
	val weight : List<String>,
	@SerializedName("eye-color") val eye_color : String,
	@SerializedName("hair-color")  val hair_color : String
)