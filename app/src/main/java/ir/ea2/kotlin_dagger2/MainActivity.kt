package ir.ea2.kotlin_dagger2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ir.ea2.kotlin_dagger2.di.DaggerCustomComponent
import ir.ea2.kotlin_dagger2.util.SafePref
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    @field:Named("SafePref1")
    lateinit var safePref: SafePref

    override fun onCreate(savedInstanceState: Bundle?) {
        //Better Called On Top Of onCreate()
        val componnet = DaggerCustomComponent.builder().setContext(baseContext).build()
        componnet.mainActivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViews()
        safePref.put("key", "Hello World!")
        safePref.get("key", "")
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
