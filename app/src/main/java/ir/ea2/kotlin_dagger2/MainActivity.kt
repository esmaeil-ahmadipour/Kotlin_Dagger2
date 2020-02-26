package ir.ea2.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.ea2.kotlin_dagger2.di.DaggerCustomComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val objectEncryptionClass = DaggerCustomComponent.create().getEncryptionObject()
        objectEncryptionClass.encrypt("123")
        objectEncryptionClass.decrypt("321")
    }
}
