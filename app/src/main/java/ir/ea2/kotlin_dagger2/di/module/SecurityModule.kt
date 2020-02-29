package ir.ea2.kotlin_dagger2.di.module

import dagger.Module
import dagger.Provides
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity
import javax.inject.Named

@Module
class SecurityModule {
    @Named("EncryptionSecurity1")
    @Provides
    fun getEncryptionSecurity(): EncryptionSecurity {
        val encryptionSecurity = EncryptionSecurity()
        encryptionSecurity.SECURITY_KEY="ABC"
        encryptionSecurity.SECURITY_IV="XYZ"
        return encryptionSecurity
    }

    @Named("EncryptionSecurity2")
    @Provides
    fun getEncryptionSecurity2(): EncryptionSecurity {
        val encryptionSecurity = EncryptionSecurity()
        encryptionSecurity.SECURITY_KEY="123"
        encryptionSecurity.SECURITY_IV="456"
        return encryptionSecurity
    }
}