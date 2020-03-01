package ir.ea2.kotlin_dagger2.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.ea2.kotlin_dagger2.MainActivity
import ir.ea2.kotlin_dagger2.SecondActivity
import ir.ea2.kotlin_dagger2.di.scope.ActivityScope

@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [SafePrefModule::class])
    abstract fun provideMainActivity():MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [SafePrefModule::class])
    abstract fun provideSecondActivity():SecondActivity
}