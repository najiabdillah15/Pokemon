package com.naji.pokemontes.repository

import com.naji.pokemontes.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET

interface PokemonService {
    @GET("pokemon.json")
    fun get(): Call<List<Pokemon>>
}
