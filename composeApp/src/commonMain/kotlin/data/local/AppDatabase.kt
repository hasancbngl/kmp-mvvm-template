package data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import domain.AppEntity

@Database(entities = [AppEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dao(): AppDao
}