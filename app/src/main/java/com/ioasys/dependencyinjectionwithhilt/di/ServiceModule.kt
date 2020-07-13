package com.ioasys.dependencyinjectionwithhilt.di

import com.ioasys.dependencyinjectionwithhilt.data.remote.interactor.RemoteApi
import com.ioasys.dependencyinjectionwithhilt.data.remote.interactor.RemoteApiImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class ServiceModule {

    @Binds
    @Singleton
    abstract fun bindRemoteApi(remoteApiImpl: RemoteApiImpl): RemoteApi
}