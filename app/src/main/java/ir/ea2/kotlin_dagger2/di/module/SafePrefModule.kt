package ir.ea2.kotlin_dagger2.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ir.ea2.kotlin_dagger2.di.scope.ActivityScope
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import ir.ea2.kotlin_dagger2.util.SafePref
import javax.inject.Named
import javax.inject.Singleton

@Module
class SafePrefModule {

    @ActivityScope
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