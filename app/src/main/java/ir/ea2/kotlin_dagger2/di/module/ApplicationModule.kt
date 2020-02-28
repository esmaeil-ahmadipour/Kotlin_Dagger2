package ir.ea2.kotlin_dagger2.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity
import ir.ea2.kotlin_dagger2.qualifier.QualifierAnnotation
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import ir.ea2.kotlin_dagger2.util.SafePref
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApplicationModule {
    //We Changing Security Method By Calling Named-Annotation.

    @Named("EncryptionSecurity1")
    @Provides
    fun getEncryptionSecurity():EncryptionSecurity{
        val encryptionSecurity = EncryptionSecurity()
        encryptionSecurity.SECURITY_KEY="ABC"
        encryptionSecurity.SECURITY_IV="XYZ"
        return encryptionSecurity
    }

    @Named("EncryptionSecurity2")
    @Provides
    fun getEncryptionSecurity2():EncryptionSecurity{
        val encryptionSecurity = EncryptionSecurity()
        encryptionSecurity.SECURITY_KEY="123"
        encryptionSecurity.SECURITY_IV="456"
        return encryptionSecurity
    }

    @Named("EncryptionClass1")
    @Provides
    fun getEncryptionClass1(@Named("EncryptionSecurity1") encryptionSecurity: EncryptionSecurity):EncryptionClass{
        val encryptionClass =EncryptionClass()
        encryptionClass.encryptionSecurityInject(encryptionSecurity)
        return  encryptionClass
    }

    @Named("EncryptionClass2")
    @Provides
    fun getEncryptionClass2(@Named("EncryptionSecurity2") encryptionSecurity: EncryptionSecurity):EncryptionClass{
        val encryptionClass =EncryptionClass()
        encryptionClass.encryptionSecurityInject(encryptionSecurity)
        return  encryptionClass
    }

    @Singleton
    @Named("SafePref1")
    @Provides
    fun getSafePref1(context: Context ,@Named("EncryptionClass1") encryptionClass: EncryptionClass):SafePref{
        return SafePref(context,encryptionClass)
    }

    @Named("SafePref2")
    @Provides
    fun getSafePref2(context: Context ,@Named("EncryptionClass2") encryptionClass: EncryptionClass):SafePref{
        return SafePref(context,encryptionClass)
    }
}
//Access And Changing Value From EncryptionSecurity , When can't Constructor Injection For EncryptionSecurity .