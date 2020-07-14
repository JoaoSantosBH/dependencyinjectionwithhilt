package com.ioasys.dependencyinjectionwithhilt.domain.interactor
import com.ioasys.dependencyinjectionwithhilt.domain.model.User

interface UserInteractor {
    suspend fun saveUser(user: User)
    suspend fun getUser(): User
    suspend fun updateUser(user: User)
}