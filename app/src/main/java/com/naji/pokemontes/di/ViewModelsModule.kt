package com.naji.pokemontes.di

import com.naji.pokemontes.ui.dashboard.DashboardViewModel
import com.naji.pokemontes.ui.generation.GenerationViewModel
import com.naji.pokemontes.ui.home.HomeViewModel
import com.naji.pokemontes.ui.pokedex.PokedexViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { DashboardViewModel(get()) }
    viewModel { GenerationViewModel(get()) }
    viewModel { HomeViewModel(get()) }
    viewModel { PokedexViewModel(get(), get()) }
}
