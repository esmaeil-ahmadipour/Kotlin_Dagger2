package ir.ea2.kotlin_dagger2.di

import dagger.Component
import ir.ea2.kotlin_dagger2.util.EncryptionClass

@Component
interface CustomComponent {
    fun getEncryptionObject():EncryptionClass
}