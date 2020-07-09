package com.jomar.senhorpintor.data.local.interactor.budget.user

import com.ioasys.dependencyinjectionwithhilt.model.User

interface UserInteractor {
    suspend fun saveUser(user: User)
    suspend fun getUser(): User
    suspend fun updateUser(user: User)
}