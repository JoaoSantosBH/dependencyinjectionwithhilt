package com.ioasys.dependencyinjectionwithhilt.data.local.interactor

import com.ioasys.dependencyinjectionwithhilt.model.User
import javax.inject.Inject

class UserInteractorImpl @Inject constructor( val userRepository: UserRepository): UserInteractor {
    override suspend fun saveUser(user: User) {
       userRepository.saveUser(user)
    }

    override suspend fun getUser(): User {
        return userRepository.getUser()
    }

    override suspend fun updateUser(user: User) {
        userRepository.updateUser(user)
    }
}