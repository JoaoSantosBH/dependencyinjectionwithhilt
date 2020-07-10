package com.ioasys.dependencyinjectionwithhilt.di

import com.ioasys.dependencyinjectionwithhilt.data.local.interactor.UserInteractor
import com.ioasys.dependencyinjectionwithhilt.data.local.interactor.UserInteractorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class InteractorModule {

    @Binds
    abstract fun bindInteractor(userInteractor: UserInteractorImpl): UserInteractor

}

