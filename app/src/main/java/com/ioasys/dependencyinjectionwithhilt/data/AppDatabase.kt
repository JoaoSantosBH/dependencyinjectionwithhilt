package com.ioasys.dependencyinjectionwithhilt.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ioasys.dependencyinjectionwithhilt.dao.UserDao
import com.ioasys.dependencyinjectionwithhilt.model.User


@Database(entities = [User::class], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}