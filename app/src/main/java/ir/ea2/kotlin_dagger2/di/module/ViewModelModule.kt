package ir.ea2.kotlin_dagger2.di.module

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import ir.ea2.kotlin_dagger2.keys.ViewModelKey
import ir.ea2.kotlin_dagger2.view_models.MainActivityViewModel
import ir.ea2.kotlin_dagger2.view_models.SecondActivityViewModel

@Module
abstract class ViewModelModule {

    @Binds
    @ViewModelKey(MainActivityViewModel::class)
    @IntoMap
    abstract fun provideMainViewModule(vm:MainActivityViewModel) : ViewModel



    @Binds
    @ViewModelKey(SecondActivityViewModel::class)
    @IntoMap
   abstract fun provideSecondViewModule(vm:SecondActivityViewModel):ViewModel

}