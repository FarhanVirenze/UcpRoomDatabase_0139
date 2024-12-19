package com.pam.pam_ucp2.repository

import com.pam.pam_ucp2.data.dao.DosenDao
import com.pam.pam_ucp2.data.entity.Dosen
import kotlinx.coroutines.flow.Flow


class LocalRepositoryDosen(
    private val dosenDao: DosenDao
) : RepositoryDosen {
    override suspend fun insertDosen(dosen: Dosen) {
        dosenDao.insertDosen(dosen)
    }

    override fun getAllDsn(): Flow<List<Dosen>> {
        return dosenDao.getAllDsn()
    }

    override fun getDosen(nidn: String): Flow<Dosen> {
        return dosenDao.getDosen(nidn)
    }
}
