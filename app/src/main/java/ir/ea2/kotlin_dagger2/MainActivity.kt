package ir.ea2.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.ea2.kotlin_dagger2.di.DaggerCustomComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val componnet = DaggerCustomComponent.builder().setContext(baseContext).build()
        val safe_pref=componnet.getSaePref()
        safe_pref.put("key","Hello World!")
        safe_pref.get("key","")
    }
}
