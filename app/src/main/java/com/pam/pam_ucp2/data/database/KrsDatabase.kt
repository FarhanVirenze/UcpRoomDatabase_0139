package com.pam.pam_ucp2.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.pam.pam_ucp2.data.dao.DosenDao
import com.pam.pam_ucp2.data.dao.MatakuliahDao
import com.pam.pam_ucp2.data.entity.Dosen
import com.pam.pam_ucp2.data.entity.Matakuliah

@Database(entities = [Dosen::class, Matakuliah::class ], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {

    abstract fun dosenDao(): DosenDao
    abstract fun matakuliahDao(): MatakuliahDao

    companion object {
        @Volatile
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase {
            return (Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java,
                    "KrsDatabase"
                )
                    .build(). also { Instance = it }
            })
        }
    }
}