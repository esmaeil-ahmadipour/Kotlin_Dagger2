package ir.ea2.kotlin_dagger2.di.module

import dagger.Module
import dagger.Provides
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import javax.inject.Named
import javax.inject.Singleton

@Module
class EncryptionModule {

    @Singleton
    @Named("EncryptionClass1")
    @Provides
    fun getEncryptionClass1(@Named("EncryptionSecurity1") encryptionSecurity: EncryptionSecurity): EncryptionClass {
        val encryptionClass = EncryptionClass()
        encryptionClass.encryptionSecurityInject(encryptionSecurity)
        return  encryptionClass
    }

    @Named("EncryptionClass2")
    @Provides
    fun getEncryptionClass2(@Named("EncryptionSecurity2") encryptionSecurity: EncryptionSecurity): EncryptionClass {
        val encryptionClass = EncryptionClass()
        encryptionClass.encryptionSecurityInject(encryptionSecurity)
        return  encryptionClass
    }

}