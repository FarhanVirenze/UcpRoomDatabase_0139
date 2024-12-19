package com.pam.pam_ucp2.ui.viewmodel.dosen

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.pam.pam_ucp2.KrsApp

object PenyediaDosenViewModel {

    val Factory = viewModelFactory {
        initializer {
            DosenViewModel(
                KrsApp().containerApp.repositoryDosen,
            )
        }
        initializer {
            HomeDosenViewModel(
                KrsApp().containerApp.repositoryDosen,
            )
        }
        initializer {
            DetailDosenViewModel(
                createSavedStateHandle(),
                KrsApp().containerApp.repositoryDosen,
            )
        }
    }
}

fun CreationExtras.KrsApp(): KrsApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KrsApp)
