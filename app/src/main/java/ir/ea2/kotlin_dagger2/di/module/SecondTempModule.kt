package ir.ea2.kotlin_dagger2.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity

@Module
class SecondTempModule {
    @Provides
    @IntoMap
    @StringKey("es2")
    fun provideEncryptionSecurity(): EncryptionSecurity {
        val eSecurity = EncryptionSecurity()
        eSecurity.SECURITY_KEY = "202"

        return eSecurity
    }
}
