package com.ioasys.dependencyinjectionwithhilt.presentation.register

import com.ioasys.dependencyinjectionwithhilt.model.User
import com.jomar.senhorpintor.data.local.interactor.budget.user.UserInteractor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RegisterViewModel @Inject constructor (private val userInteractor: UserInteractor) {

    lateinit var myUser: User

    suspend fun saveUser(user: User) = withContext(Dispatchers.IO) {
        userInteractor.saveUser(user)
    }

    suspend fun updateUser(user: User) = withContext(Dispatchers.IO) {
        userInteractor.updateUser(user)
    }

    suspend fun getUser() = withContext(Dispatchers.IO) {
        myUser = userInteractor.getUser()
    }

//    suspend fun makeFirstAccess() = withContext(Dispatchers.IO) {
//        preferencesRepository.makeFirstRunning()
//    }
}