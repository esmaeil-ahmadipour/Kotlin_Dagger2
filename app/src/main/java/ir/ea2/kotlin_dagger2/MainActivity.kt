package ir.ea2.kotlin_dagger2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import ir.ea2.kotlin_dagger2.di.EncryptionSecurity
import ir.ea2.kotlin_dagger2.di.ViewModelInjector
import ir.ea2.kotlin_dagger2.util.EncryptionClass
import ir.ea2.kotlin_dagger2.util.SafePref
import ir.ea2.kotlin_dagger2.view_models.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    @field:Named("SafePref1")
    lateinit var safePref: SafePref

    @Inject
    @field:Named("SafePref1")
    lateinit var secondSafePref: SafePref

    @Inject
    @field:Named("EncryptionClass1")
    lateinit var encryptionClass: EncryptionClass

    @Inject
    lateinit var eSecurities: Map<String,EncryptionSecurity>

    @Inject
    lateinit var factory: ViewModelInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViews()
        setInjection()

    }

    private fun setInjection() {
        safePref.put("key", "Hello World!")
        safePref.get("key", "")
        Log.i("TAG_OBJECTS","First SafePref: $safePref AND Second SafePref: $secondSafePref AND Encryption: $encryptionClass")

        for(i in eSecurities){
            Log.i("TAG_MAP_MODULES", "KEY : ${i.key} & VALUE: ${i.value.SECURITY_KEY}" )
        }
    }

    private fun setViews() {

        val vm = ViewModelProvider(this,factory)[MainActivityViewModel::class.java]
        vm.testLog()

        button.setOnClickListener(View.OnClickListener {
            intent= Intent(this , SecondActivity::class.java)
            startActivity(intent)
        })
    }
}
