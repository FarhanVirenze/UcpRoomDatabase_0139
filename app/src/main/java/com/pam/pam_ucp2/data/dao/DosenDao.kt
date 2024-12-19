package com.pam.pam_ucp2.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.pam.pam_ucp2.data.entity.Dosen
import kotlinx.coroutines.flow.Flow

@Dao
interface DosenDao {
    @Insert
    suspend fun insertDosen(
        dosen: Dosen
    )
    //getAllDosen
    @Query("SELECT * FROM dosen ORDER BY nama ASC")
    fun getAllDsn() : Flow<List<Dosen>>
    //getDosen
    @Query("SELECT * FROM dosen WHERE nidn = :nidn")
    fun getDosen(nidn: String): Flow<Dosen>
}
