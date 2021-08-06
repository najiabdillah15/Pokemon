package com.naji.pokemontes.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.naji.pokemontes.database.dao.PokemonDAO
import com.naji.pokemontes.model.Pokemon

class DashboardViewModel(private val pokemonDAO: PokemonDAO) : ViewModel() {

    fun getPokemonById(id: String?): LiveData<Pokemon> {
        return pokemonDAO.getById(id)
    }

    fun getPokemonEvolutionsByIds(ids: List<String>): LiveData<List<Pokemon>> {
        return pokemonDAO.getEvolutionsByIds(ids)
    }
}
