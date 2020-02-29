package ir.ea2.kotlin_dagger2.di

import android.app.Application

class DaggerApplication : Application() {
    lateinit var daggerComponent: CustomComponent

    override fun onCreate() {
        super.onCreate()
        daggerComponent=DaggerCustomComponent.factory().create(this)
    }
}