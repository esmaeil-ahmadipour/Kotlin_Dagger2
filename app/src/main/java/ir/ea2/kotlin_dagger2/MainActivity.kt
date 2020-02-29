package ir.ea2.kotlin_dagger2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ir.ea2.kotlin_dagger2.di.DaggerActivityComponent
import ir.ea2.kotlin_dagger2.di.DaggerApplication
import ir.ea2.kotlin_dagger2.di.DaggerCustomComponent
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import ir.ea2.kotlin_dagger2.util.SafePref
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    @field:Named("SafePref1")
    lateinit var safePref: SafePref

    @Inject
    @field:Named("SafePref1")
    lateinit var secondSafePref: SafePref

    @Inject
    @field:Named("EncryptionClass1")
    lateinit var encryptionClass: EncryptionClass

    override fun onCreate(savedInstanceState: Bundle?) {
        //Better Called On Top Of onCreate()
//        (applicationContext as DaggerApplication).daggerComponent.mainActivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerActivityComponent.builder().customComponent((applicationContext as DaggerApplication).daggerComponent).build().mainActivityInject(this)

        setViews()
        safePref.put("key", "Hello World!")
        safePref.get("key", "")
        Log.i("TAG_OBJECTS","First SafePref: $safePref AND Second SafePref: $secondSafePref AND Encryption: $encryptionClass")
/*
        val safe_pref=componnet.getSaePref()
        safe_pref.put("key","Hello World!")
        safe_pref.get("key","")

        val safe_pref2=componnet.getSaePref2()
        safe_pref2.put("key2","Hello World!")
        safe_pref2.get("key2","")
*/
    }

    private fun setViews() {
        button.setOnClickListener(View.OnClickListener {
            intent= Intent(this , SecondActivity::class.java)
            startActivity(intent)
        })
    }
}
