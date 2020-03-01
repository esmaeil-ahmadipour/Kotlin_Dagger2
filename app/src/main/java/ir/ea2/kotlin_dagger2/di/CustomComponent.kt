package ir.ea2.kotlin_dagger2.di
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjection
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import ir.ea2.kotlin_dagger2.di.module.*
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,EncryptionModule::class,SecurityModule::class,FirstTempModule::class,SecondTempModule::class,ActivityModule::class])
interface CustomComponent : AndroidInjector<DaggerApp>{

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CustomComponent
    }
}
