package data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import domain.AppEntity
import kotlinx.coroutines.flow.Flow
@Dao
interface AppDao {
    @Insert
    suspend fun addData(appEntity: AppEntity)

    @Update
    suspend fun updateData(appEntity: AppEntity)

    @Query("DELETE FROM appEntityTable WHERE id = :id")
    suspend fun deleteData(id: Int)

    @Query("SELECT * FROM appEntityTable")
    fun readData(): Flow<List<AppEntity>>
}