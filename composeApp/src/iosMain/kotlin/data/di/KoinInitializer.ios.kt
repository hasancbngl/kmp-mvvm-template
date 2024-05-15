package data

import data.local.AppDatabase
import data.local.getDatabaseBuilder
import data.local.getRoomDatabase
import data.repository.AppRepository
import org.koin.core.context.startKoin
import org.koin.dsl.module

actual class KoinInitializer {
    actual fun init() {
        startKoin {
            modules(viewModelModule,    module {
                single { getDatabaseBuilder() }
                single { getRoomDatabase(get()) }
                single { get<AppDatabase>().dao() }
                // Repository and ViewModels
                single { AppRepository(get()) }
            })
        }
    }
}