package com.naji.pokemontes

import android.app.Application
import com.naji.pokemontes.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        configureDI()
    }

    private fun configureDI() = startKoin {
        androidContext(this@App)
        modules(appComponent)
    }
}
