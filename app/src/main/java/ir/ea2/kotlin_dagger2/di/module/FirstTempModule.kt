package ir.ea2.kotlin_dagger2.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity

@Module
class FirstTempModule {
    @Provides
    @IntoMap
    @StringKey("es1")
    fun provideEncryptionSecurity(): EncryptionSecurity {
        val eSecurity = EncryptionSecurity()
        eSecurity.SECURITY_KEY = "101"

        return eSecurity
    }
}
