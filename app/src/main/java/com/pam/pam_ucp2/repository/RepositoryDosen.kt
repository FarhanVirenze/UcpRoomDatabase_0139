package com.pam.pam_ucp2.repository

import com.pam.pam_ucp2.data.entity.Dosen
import kotlinx.coroutines.flow.Flow

interface RepositoryDosen {
    suspend fun insertDosen(dosen: Dosen)
    //getAllDosen
    fun getAllDosen(): Flow<List<Dosen>>
    //getDosen
    fun getDosen(nidn: String): Flow<Dosen>
    //deleteDosen
    suspend fun deleteDosen(dosen: Dosen)
    //updateDosen
    suspend fun updateDosen(dosen: Dosen)
}