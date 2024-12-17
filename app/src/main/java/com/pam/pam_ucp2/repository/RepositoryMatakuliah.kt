package com.pam.pam_ucp2.repository

import com.pam.pam_ucp2.data.entity.Matakuliah
import kotlinx.coroutines.flow.Flow

interface RepositoryMatakuliah {
    suspend fun insertMatakuliah(matakuliah: Matakuliah)
    //getAllMatakuliah
    fun getAllMatakuliah(): Flow<List<Matakuliah>>
    //getMatakuliah
    fun getMhs(kode: String): Flow<Matakuliah>
    //deleteMatakuliah
    suspend fun deleteMatakuliah(matakuliah: Matakuliah)
    //updateMatakuliah
    suspend fun updateMatakuliah(matakuliah: Matakuliah)
}