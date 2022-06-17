package com.example.swapplication.models

import com.google.gson.annotations.SerializedName

data class Person(

	@field:SerializedName("films")
	val films: List<String>,

	@field:SerializedName("homeworld")
	val homeworld: String,

	@field:SerializedName("gender")
	val gender: String,

	@field:SerializedName("skin_color")
	val skinColor: String,

	@field:SerializedName("edited")
	val edited: String,

	@field:SerializedName("created")
	val created: String,

	@field:SerializedName("mass")
	val mass: String,

	@field:SerializedName("vehicles")
	val vehicles: List<String>,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("hair_color")
	val hairColor: String,

	@field:SerializedName("birth_year")
	val birthYear: String,

	@field:SerializedName("eye_color")
	val eyeColor: String,

	@field:SerializedName("species")
	val species: List<Any>,

	@field:SerializedName("starships")
	val starships: List<String>,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("height")
	val height: String
)
