package data

import org.koin.core.module.Module
import org.koin.dsl.module
import presentation.detail.DetailViewModel
import presentation.main.MainViewModel

actual val viewModelModule: Module
    get() = module {
        factory { MainViewModel(get()) }
        factory { DetailViewModel(get()) }
    }