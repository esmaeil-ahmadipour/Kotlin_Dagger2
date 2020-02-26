package ir.ea2.kotlin_dagger2.util

import android.util.Log
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity
import javax.inject.Inject

class EncryptionClass @Inject constructor() {

    var security: EncryptionSecurity? =null

    fun encrypt(stringValue:String):String{
        Log.i("TAG_ENCRYPT:","Run EncryptionClass.encrypt()")
        Log.i("TAG_KEY:","Get SECURITY_KEY : ${security?.SECURITY_KEY}")

        return stringValue
    }
    fun decrypt(stringValue:String):String{
        Log.i("TAG_DECRYPT:","Run EncryptionClass.decrypt()")
        Log.i("TAG_IV:","Get SECURITY_IV : ${security?.SECURITY_IV}")
        return stringValue
    }

    @Inject
    fun encryptionSecurityInject(security:EncryptionSecurity){
        this.security=security
    }
}