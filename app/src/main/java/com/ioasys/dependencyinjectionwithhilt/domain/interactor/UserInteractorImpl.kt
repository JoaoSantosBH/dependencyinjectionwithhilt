package com.ioasys.dependencyinjectionwithhilt.domain.interactor

import com.ioasys.dependencyinjectionwithhilt.data.local.repository.UserRepository
import com.ioasys.dependencyinjectionwithhilt.domain.model.User
import javax.inject.Inject

class UserInteractorImpl @Inject constructor(private val userRepository: UserRepository): UserInteractor {
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