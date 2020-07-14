package com.ioasys.dependencyinjectionwithhilt.presentation.register

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.ioasys.dependencyinjectionwithhilt.domain.interactor.UserInteractor
import com.ioasys.dependencyinjectionwithhilt.domain.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RegisterViewModel @ViewModelInject constructor (
    private val userInteractor: UserInteractor
) : ViewModel(){

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

}