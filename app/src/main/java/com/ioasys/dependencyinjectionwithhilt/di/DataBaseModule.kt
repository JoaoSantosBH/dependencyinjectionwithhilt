package com.ioasys.dependencyinjectionwithhilt.di

import android.content.Context
import androidx.room.Room
import com.ioasys.dependencyinjectionwithhilt.dao.UserDao
import com.ioasys.dependencyinjectionwithhilt.data.AppDatabase
import com.ioasys.dependencyinjectionwithhilt.data.local.interactor.UserInteractor
import com.ioasys.dependencyinjectionwithhilt.data.local.interactor.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton
//TODO 09
@Module
@InstallIn(ApplicationComponent::class)

object DataBaseModule {
    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext appContext: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "dep_hilt.db"
        )
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun provideUserDao(database: AppDatabase): UserDao {
        return database.userDao()
    }

}