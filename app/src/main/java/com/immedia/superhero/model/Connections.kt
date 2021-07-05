package com.immedia.superhero.model

import com.google.gson.annotations.SerializedName

data class Connections (

	@SerializedName("group-affiliation") val group_affiliation : String,
	val relatives : String
)