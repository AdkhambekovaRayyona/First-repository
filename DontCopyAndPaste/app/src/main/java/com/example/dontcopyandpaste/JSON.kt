package com.example.dontcopyandpaste

data class Json(
    val name: String,
    val age:Int,
    val occupation:String,
    val hobbies: List<String>
        )

data class ID(
    val id:Int,
    val name: String,
    val price: Float
)
