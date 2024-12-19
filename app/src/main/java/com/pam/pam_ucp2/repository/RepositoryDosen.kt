package com.pam.pam_ucp2.repository

import com.pam.pam_ucp2.data.entity.Dosen
import kotlinx.coroutines.flow.Flow

interface RepositoryDosen {
    suspend fun insertDosen(dosen: Dosen)
    //getAllDosen
    fun getAllDsn(): Flow<List<Dosen>>
    //getDosen
    fun getDosen(nidn: String): Flow<Dosen>
}