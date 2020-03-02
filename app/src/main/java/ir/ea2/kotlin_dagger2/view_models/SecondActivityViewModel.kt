package ir.ea2.kotlin_dagger2.view_models

import android.util.Log
import androidx.lifecycle.ViewModel
import ir.ea2.kotlin_dagger2.util.SafePref
import javax.inject.Inject

class SecondActivityViewModel @Inject constructor(val safePref: SafePref) : ViewModel() {
    init {
        Log.i("TAG_INIT", "SECOND ACTIVITY IS INITIALIZED ")
    }

    fun testLog() {
        Log.i("TAG_TEST", "TEST SECOND_ACTIVITY_VM : $safePref")
    }
}