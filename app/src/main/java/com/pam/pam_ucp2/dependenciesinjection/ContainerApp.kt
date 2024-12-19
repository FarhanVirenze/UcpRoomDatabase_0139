package com.pam.pam_ucp2.dependenciesinjection

import android.content.Context
import com.pam.pam_ucp2.data.database.KrsDatabase
import com.pam.pam_ucp2.repository.LocalRepositoryDosen
import com.pam.pam_ucp2.repository.LocalRepositoryMatakuliah
import com.pam.pam_ucp2.repository.RepositoryDosen
import com.pam.pam_ucp2.repository.RepositoryMatakuliah

// Interface untuk Dependency Injection
interface InterfaceContainerApp {
    val repositoryDosen: RepositoryDosen
    val repositoryMatakuliah: RepositoryMatakuliah
}

// Implementasi InterfaceContainerApp
class ContainerApp(private val context: Context) : InterfaceContainerApp {

    // Inisialisasi RepositoryDosen menggunakan DAO yang relevan
    override val repositoryDosen: RepositoryDosen by lazy {
        LocalRepositoryDosen(KrsDatabase.getDatabase(context).dosenDao())
    }

    // Inisialisasi RepositoryMatakuliah menggunakan DAO yang relevan
    override val repositoryMatakuliah: RepositoryMatakuliah by lazy {
        LocalRepositoryMatakuliah(KrsDatabase.getDatabase(context).matakuliahDao())
    }
}
