package com.ioasys.dependencyinjectionwithhilt.data.local.repository

import com.ioasys.dependencyinjectionwithhilt.domain.model.User

interface UserRepository {
    suspend fun saveUser(user: User)
    suspend fun getUser(): User
    suspend fun updateUser(user: User)
}