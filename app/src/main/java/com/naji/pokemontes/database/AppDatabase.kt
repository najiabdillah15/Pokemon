package com.naji.pokemontes.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.naji.pokemontes.database.dao.PokemonDAO
import com.naji.pokemontes.model.Pokemon

@Database(entities = [Pokemon::class], version = 5, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun pokemonDAO(): PokemonDAO
}
