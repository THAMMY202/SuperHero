package com.immedia.superhero.model

import Image

data class Results (

	val id : Int,
	val name : String,
	val powerstats : Powerstats,
	val biography : Biography,
	val appearance : Appearance,
	val work : Work,
	val connections : Connections,
	val image : Image
)