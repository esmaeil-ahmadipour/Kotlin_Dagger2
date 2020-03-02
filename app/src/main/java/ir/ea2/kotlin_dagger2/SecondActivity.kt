package ir.ea2.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import ir.ea2.kotlin_dagger2.util.SafePref
import ir.ea2.kotlin_dagger2.view_models.MainActivityViewModel
import ir.ea2.kotlin_dagger2.view_models.SecondActivityViewModel
import javax.inject.Inject
import javax.inject.Named

class SecondActivity : DaggerAppCompatActivity() {

    @Inject
    @field:Named("SafePref1")
    lateinit var autoSafePref1: SafePref

    @Inject
    @field:Named("SafePref1")
    lateinit var autoSafePref2: SafePref

    @Inject
    @field:Named("EncryptionClass1")
    lateinit var encryptionClass: EncryptionClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setViews()
        Log.i("TAG_OBJECTS","AutoSafePref1: $autoSafePref1 AND AutoSafePref2: $autoSafePref2 AND Encryption: $encryptionClass")
    }

    private fun setViews() {
        val vm = ViewModelProvider(this).get(SecondActivityViewModel::class.java)
        vm.testLog()
    }
}
