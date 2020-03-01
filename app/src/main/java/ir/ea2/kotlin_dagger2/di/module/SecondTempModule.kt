package ir.ea2.kotlin_dagger2.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity

@Module
class SecondTempModule {
    @Provides
    @ElementsIntoSet
    fun provideEncryptionSecurity(): Set<EncryptionSecurity> {

        val eSecuritySet = HashSet<EncryptionSecurity>()

        val eSecurity1 = EncryptionSecurity()
        eSecurity1.SECURITY_KEY = "202-1"
        eSecuritySet.add(eSecurity1)

        val eSecurity2 = EncryptionSecurity()
        eSecurity2.SECURITY_KEY = "202-2"
        eSecuritySet.add(eSecurity2)

        return eSecuritySet
    }
}
