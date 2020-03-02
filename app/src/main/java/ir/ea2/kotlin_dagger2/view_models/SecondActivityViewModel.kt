package ir.ea2.kotlin_dagger2.view_models

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import ir.ea2.kotlin_dagger2.util.SafePref

class SecondActivityViewModel (val safePref: SafePref)  :ViewModel(){

    fun testLog(){
        Log.i("TAG_TEST","TEST SECOND_ACTIVITY_VM : $safePref")
    }
}