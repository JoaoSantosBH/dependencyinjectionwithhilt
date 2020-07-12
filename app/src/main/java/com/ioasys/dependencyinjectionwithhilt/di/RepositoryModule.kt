package com.ioasys.dependencyinjectionwithhilt.di

import com.ioasys.dependencyinjectionwithhilt.data.local.repository.UserRepository
import com.ioasys.dependencyinjectionwithhilt.data.local.repository.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule{

    @Binds
    abstract fun bindRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

}
