package com.pam.pam_ucp2.repository

import com.pam.pam_ucp2.data.entity.Matakuliah
import kotlinx.coroutines.flow.Flow

interface RepositoryMatakuliah {
    suspend fun insertMtk(matakuliah: Matakuliah)
    //getAllMatakuliah
    fun getAllMtk(): Flow<List<Matakuliah>>
    //getMatakuliah
    fun getMatakuliah(kode: String): Flow<Matakuliah>
    //deleteMatakuliah
    suspend fun deleteMtk(matakuliah: Matakuliah)
    //updateMatakuliah
    suspend fun updateMtk(matakuliah: Matakuliah)
}