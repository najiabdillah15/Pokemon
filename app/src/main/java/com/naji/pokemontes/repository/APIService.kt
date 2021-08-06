package com.naji.pokemontes.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object APIService {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://pokeapi.co/docs/v2")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val pokemonService: PokemonService = retrofit.create()
}
