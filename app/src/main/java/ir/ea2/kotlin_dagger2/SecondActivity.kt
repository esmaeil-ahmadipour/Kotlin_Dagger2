package ir.ea2.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.ea2.kotlin_dagger2.di.DaggerApplication
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import ir.ea2.kotlin_dagger2.util.SafePref
import javax.inject.Inject
import javax.inject.Named

class SecondActivity : AppCompatActivity() {

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

        val activityComponent=(applicationContext as DaggerApplication).daggerComponent.getActivityComponent()
        activityComponent.secondActivityInject(this)

        Log.i("TAG_OBJECTS","AutoSafePref1: $autoSafePref1 AND AutoSafePref2: $autoSafePref2 AND Encryption: $encryptionClass")
    }
}
