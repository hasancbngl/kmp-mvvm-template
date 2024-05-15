package domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "appEntityTable")
data class AppEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String = ""
)