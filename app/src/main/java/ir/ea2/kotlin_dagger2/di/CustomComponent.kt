package ir.ea2.kotlin_dagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.ea2.kotlin_dagger2.MainActivity
import ir.ea2.kotlin_dagger2.SecondActivity
import ir.ea2.kotlin_dagger2.di.module.ApplicationModule
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import ir.ea2.kotlin_dagger2.util.SafePref
import javax.inject.Named

@Component(modules = [ApplicationModule::class])
interface CustomComponent {
    fun getEncryptionObject(): EncryptionClass

    @Named("SafePref1")
    fun getSaePref(): SafePref

    @Named("SafePref2")
    fun getSaePref2(): SafePref

    fun mainActivityInject(activity: MainActivity)
    fun secondActivityInject(activity: SecondActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun setContext(context: Context):Builder

        fun build(): CustomComponent
    }
}
/*With This Annotation :
  We set access to this component for module classes that need them.
 */