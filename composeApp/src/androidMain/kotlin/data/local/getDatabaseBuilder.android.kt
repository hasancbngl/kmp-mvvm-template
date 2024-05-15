package data.local

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import data.Contants.APP_DB_NAME

fun getDatabaseBuilder(ctx: Context): RoomDatabase.Builder<AppDatabase> {
    val appContext = ctx.applicationContext
    val dbFile = appContext.getDatabasePath(APP_DB_NAME)
    return Room.databaseBuilder<AppDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}