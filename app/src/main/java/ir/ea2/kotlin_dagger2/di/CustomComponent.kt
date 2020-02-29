package ir.ea2.kotlin_dagger2.di
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.ea2.kotlin_dagger2.di.module.EncryptionModule
import ir.ea2.kotlin_dagger2.di.module.SecurityModule
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [EncryptionModule::class,SecurityModule::class])
interface CustomComponent {

    fun getActivityComponent():ActivityComponent.Builder

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun setContext(context: Context):Builder

        fun build(): CustomComponent
    }
}
