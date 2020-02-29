package ir.ea2.kotlin_dagger2.util

import android.util.Base64
import android.util.Log
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity
import javax.inject.Inject
import javax.inject.Named

class EncryptionClass @Inject constructor() {

    var security: EncryptionSecurity? =null

    fun encrypt(stringValue:String):String{
        Log.i("TAG_EN_KEY" , "Encryption Done By Key : ${security?.SECURITY_KEY}")
        return Base64.encodeToString(stringValue.toByteArray(),Base64.DEFAULT)
    }
    fun decrypt(stringValue:String):String{
        return String(Base64.decode(stringValue,Base64.DEFAULT))
    }

    @Inject
    fun encryptionSecurityInject(@Named("EncryptionSecurity2") security:EncryptionSecurity){
        this.security=security
    }
}
/*Priority Injection By Dagger2:
    1-Constructor Injection.
    2-Field Injection.
    3-Method Injection.
*/