package ir.ea2.kotlin_dagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.ea2.kotlin_dagger2.di.module.ApplicationModule
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import ir.ea2.kotlin_dagger2.util.SafePref

@Component(modules = [ApplicationModule::class])
interface CustomComponent {
    fun getEncryptionObject(): EncryptionClass

    fun getSaePref(): SafePref

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