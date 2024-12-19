package com.pam.pam_ucp2.repository

import com.pam.pam_ucp2.data.dao.MatakuliahDao
import com.pam.pam_ucp2.data.entity.Matakuliah
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMatakuliah(
    private val matakuliahDao: MatakuliahDao
) : RepositoryMatakuliah {
    override suspend fun insertMtk(matakuliah: Matakuliah) {
        matakuliahDao.insertMatakuliah(matakuliah)
    }

    override fun getAllMtk(): Flow<List<Matakuliah>> {
        return matakuliahDao.getAllMtk()
    }

    override fun getMatakuliah(kode: String): Flow<Matakuliah> {
        return matakuliahDao.getMatakuliah(kode)
    }

    override suspend fun deleteMtk(matakuliah: Matakuliah) {
        matakuliahDao.deleteMatakuliah(matakuliah)
    }

    override suspend fun updateMtk(matakuliah: Matakuliah) {
        matakuliahDao.updateMatakuliah(matakuliah)
    }
}
