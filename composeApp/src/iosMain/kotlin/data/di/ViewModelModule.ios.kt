package data

import org.koin.dsl.module
import presentation.detail.DetailViewModel
import presentation.main.MainViewModel

actual val viewModelModule = module {
    factory { MainViewModel(get()) }
    factory { DetailViewModel(get()) }
}