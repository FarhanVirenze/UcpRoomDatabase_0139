package com.pam.pam_ucp2.dependenciesinjection

import android.content.Context
import com.pam.pam_ucp2.data.database.KrsDatabase
import com.pam.pam_ucp2.repository.LocalRepositoryDosen
import com.pam.pam_ucp2.repository.LocalRepositoryMatakuliah
import com.pam.pam_ucp2.repository.RepositoryDosen
import com.pam.pam_ucp2.repository.RepositoryMatakuliah

interface InterfaceContainerApp {
    val repositoryDosen: RepositoryDosen
    val repositoryMatakuliah: RepositoryMatakuliah
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryDosen: RepositoryDosen by lazy {
        LocalRepositoryDosen(KrsDatabase.getDatabase(context).dosenDao())
    }
    override val repositoryMatakuliah: RepositoryMatakuliah by lazy {
        LocalRepositoryMatakuliah(KrsDatabase.getDatabase(context).matakuliahDao())
    }
}