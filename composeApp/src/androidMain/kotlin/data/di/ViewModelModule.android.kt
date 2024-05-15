package data

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import presentation.main.MainViewModel
import presentation.detail.DetailViewModel

actual val viewModelModule = module {
    viewModelOf(::MainViewModel)
    viewModelOf(::DetailViewModel)
}