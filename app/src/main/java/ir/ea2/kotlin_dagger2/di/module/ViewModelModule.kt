package ir.ea2.kotlin_dagger2.di.module

import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import ir.ea2.kotlin_dagger2.keys.ViewModelKey
import ir.ea2.kotlin_dagger2.view_models.MainActivityViewModel
import ir.ea2.kotlin_dagger2.view_models.SecondActivityViewModel

@Module
class ViewModelModule {

    @Provides
    @ViewModelKey(MainActivityViewModel::class)
    @IntoMap
    fun provideMainViewModule(vm:MainActivityViewModel) : ViewModel{
        return vm
    }


    @Provides
    @ViewModelKey(SecondActivityViewModel::class)
    @IntoMap
    fun provideSecondViewModule(vm:SecondActivityViewModel):ViewModel{
        return vm
    }
}