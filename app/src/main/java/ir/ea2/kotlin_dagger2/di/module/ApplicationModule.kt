package ir.ea2.kotlin_dagger2.di.module

import dagger.Module
import dagger.Provides
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity
import ir.ea2.kotlin_dagger2.qualifier.QualifierAnnotation

@Module
class ApplicationModule {
    @Provides
    fun getEncryptionSecurity():EncryptionSecurity{
        val encryptionSecurity = EncryptionSecurity()
        encryptionSecurity.SECURITY_KEY="ABC"
        encryptionSecurity.SECURITY_IV="XYZ"
        return encryptionSecurity
    }
    //We Changing Security Method By Calling Customized Qualifier-Annotation.
    @QualifierAnnotation
    @Provides
    fun getEncryptionSecurity2():EncryptionSecurity{
        val encryptionSecurity = EncryptionSecurity()
        encryptionSecurity.SECURITY_KEY="123"
        encryptionSecurity.SECURITY_IV="456"
        return encryptionSecurity
    }
}
//Access And Changing Value From EncryptionSecurity , When can't Constructor Injection For EncryptionSecurity .