package ir.ea2.kotlin_dagger2.util

import android.util.Log
import javax.inject.Inject

class EncryptionClass @Inject constructor() {
    fun encrypt(stringValue:String):String{
        Log.i("TAG_ENCRYPT:","Run EncryptionClass.encrypt()")
        return stringValue
    }
    fun decrypt(stringValue:String):String{
        Log.i("TAG_DECRYPT:","Run EncryptionClass.decrypt()")
        return stringValue
    }
}