package com.immedia.superhero.model

import com.google.gson.annotations.SerializedName

data class Biography(

    @SerializedName("full-name") val full_name: String,
    @SerializedName("alter-egos") val alter_egos: String,
    @SerializedName("hair-color") val aliases: List<String>,
    @SerializedName("place-of-birth") val place_of_birth: String,
    @SerializedName("first-appearance") val first_appearance: String,
    val publisher: String,
    val alignment: String
)