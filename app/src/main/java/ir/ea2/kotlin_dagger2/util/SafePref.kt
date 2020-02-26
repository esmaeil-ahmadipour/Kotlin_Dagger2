package ir.ea2.kotlin_dagger2.util

import android.content.Context
import android.util.Log
import javax.inject.Inject

class SafePref @Inject constructor(val context: Context, val encryptionObject:EncryptionClass){
    private  val  pref = context.getSharedPreferences("dagger_pref",Context.MODE_PRIVATE)
    private  val editor=pref.edit()

    fun put(key:String , value:String){
        val encryptedString =encryptionObject.encrypt(value)
        Log.i("TAG_PUT","Encrypted Value Is : $encryptedString")
        editor.putString(key, encryptedString)
        editor.commit()
    }

    fun get(key:String , default:String):String{
        val decryptedString=encryptionObject.decrypt(pref.getString(key,null)?:default)
        Log.i("TAG_GET","Decrypted Value Is : $decryptedString")
        return decryptedString
    }
}