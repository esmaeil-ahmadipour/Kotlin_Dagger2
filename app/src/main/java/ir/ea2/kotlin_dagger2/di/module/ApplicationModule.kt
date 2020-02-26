package ir.ea2.kotlin_dagger2.di.module

import dagger.Module
import dagger.Provides
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity

@Module
class ApplicationModule {
    @Provides
    fun getEncryptionSecurity():EncryptionSecurity{
        val encryptionSecurity = EncryptionSecurity()
        encryptionSecurity.SECURITY_KEY="ABC"
        encryptionSecurity.SECURITY_IV="XYZ"
        return encryptionSecurity
    }
}
//Access And Changing Value From EncryptionSecurity , When can't Constructor Injection For EncryptionSecurity .