package com.ioasys.dependencyinjectionwithhilt.data.local.interactor

import com.ioasys.dependencyinjectionwithhilt.dao.UserDao
import com.ioasys.dependencyinjectionwithhilt.model.User
import javax.inject.Inject

//TODO 06
class UserRepositoryImpl @Inject constructor ( val userDao: UserDao) : UserRepository {
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