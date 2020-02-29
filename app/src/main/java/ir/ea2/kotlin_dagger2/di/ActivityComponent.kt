package ir.ea2.kotlin_dagger2.di

import dagger.Component
import dagger.Subcomponent
import ir.ea2.kotlin_dagger2.MainActivity
import ir.ea2.kotlin_dagger2.SecondActivity
import ir.ea2.kotlin_dagger2.di.module.SafePrefModule
import ir.ea2.kotlin_dagger2.di.scope.ActivityScope

@ActivityScope
@Subcomponent(modules = [SafePrefModule::class])
interface ActivityComponent {
    fun mainActivityInject(activity: MainActivity)
    fun secondActivityInject(activity: SecondActivity)

    @Subcomponent.Builder
    interface Builder{
        fun build():ActivityComponent
    }
}