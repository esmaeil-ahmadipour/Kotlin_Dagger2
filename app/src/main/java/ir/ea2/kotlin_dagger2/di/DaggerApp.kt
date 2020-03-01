package ir.ea2.kotlin_dagger2.di

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DaggerApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerCustomComponent.factory().create(this)
    }
}