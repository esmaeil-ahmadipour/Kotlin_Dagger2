package ir.ea2.kotlin_dagger2.keys

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MustBeDocumented
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)