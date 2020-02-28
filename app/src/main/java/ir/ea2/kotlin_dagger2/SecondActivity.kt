package ir.ea2.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.ea2.kotlin_dagger2.di.DaggerApplication
import ir.ea2.kotlin_dagger2.di.DaggerCustomComponent
import ir.ea2.kotlin_dagger2.util.SafePref
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    @Inject
    lateinit var autoSafePref: SafePref

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as DaggerApplication).daggerComponent.secondActivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        autoSafePref.put("key", "Hello Coders!")
        autoSafePref.get("key", "")
    }
}
