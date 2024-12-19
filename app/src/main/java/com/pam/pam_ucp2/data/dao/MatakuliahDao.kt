package com.pam.pam_ucp2.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.pam.pam_ucp2.data.entity.Matakuliah
import kotlinx.coroutines.flow.Flow

@Dao
interface MatakuliahDao {
    @Insert
    suspend fun insertMatakuliah(
        matakuliah: Matakuliah
    )
    //getAllMatakuliah
    @Query("SELECT * FROM matakuliah ORDER BY nama ASC")
    fun getAllMtk() : Flow<List<Matakuliah>>
    //getMatakuliah
    @Query("SELECT * FROM matakuliah WHERE kode = :kode")
    fun getMatakuliah(kode: String): Flow<Matakuliah>
    //deleteMatakuliah
    @Delete
    suspend fun deleteMatakuliah (matakuliah: Matakuliah)
    //updateMatakuliah
    @Update
    suspend fun updateMatakuliah (matakuliah: Matakuliah)
}