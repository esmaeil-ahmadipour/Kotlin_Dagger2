package ir.ea2.kotlin_dagger2.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.ea2.kotlin_dagger2.view_models.MainActivityViewModel

class ViewModelInjector(val vm:MainActivityViewModel) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return  vm as T
    }

}