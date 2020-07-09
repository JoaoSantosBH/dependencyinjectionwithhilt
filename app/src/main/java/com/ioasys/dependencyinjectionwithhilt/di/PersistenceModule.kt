package com.ioasys.dependencyinjectionwithhilt.di

import com.jomar.senhorpintor.data.local.interactor.budget.user.UserRepository
import com.jomar.senhorpintor.data.local.interactor.budget.user.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class PersistenceModule {

    @Binds
    @Singleton
    abstract fun bindPreferencesHelper(userRepositoryImpl: UserRepositoryImpl): UserRepository
}
