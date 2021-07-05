package com.immedia.superhero.model

import com.google.gson.annotations.SerializedName

data class Json4Kotlin_Base (

	val response : String,

	@SerializedName("results-for") val results_for : String,
	val results : List<Results>
)