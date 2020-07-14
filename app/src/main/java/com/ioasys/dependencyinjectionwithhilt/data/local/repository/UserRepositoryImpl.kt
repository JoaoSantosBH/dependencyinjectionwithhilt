package com.ioasys.dependencyinjectionwithhilt.data.local.repository

import com.ioasys.dependencyinjectionwithhilt.dao.UserDao
import com.ioasys.dependencyinjectionwithhilt.domain.model.User
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor (private val userDao: UserDao) :
    UserRepository {
    override suspend fun saveUser(user: User) {
        userDao.insertUser(user)
    }

    override suspend fun getUser(): User {
        return userDao.getUser()
    }

    override suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }
}