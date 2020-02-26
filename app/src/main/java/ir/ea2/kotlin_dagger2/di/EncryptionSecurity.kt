package ir.ea2.kotlin_dagger2.di

import javax.inject.Inject

class EncryptionSecurity @Inject constructor() {
    val SECURITY_KEY = "12345"
    val SECURITY_IV = "67890"
}