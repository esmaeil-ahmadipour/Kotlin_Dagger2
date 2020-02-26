package ir.ea2.kotlin_dagger2.di

import dagger.Component
import ir.ea2.kotlin_dagger2.di.module.ApplicationModule
import ir.ea2.kotlin_dagger2.util.EncryptionClass

@Component(modules = [ApplicationModule::class])
interface CustomComponent {
    fun getEncryptionObject():EncryptionClass
}
/*With This Annotation :
  We set access to this component for module classes that need them.
 */