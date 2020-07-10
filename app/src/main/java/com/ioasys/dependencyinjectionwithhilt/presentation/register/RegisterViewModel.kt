package com.ioasys.dependencyinjectionwithhilt.presentation.register

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.ioasys.dependencyinjectionwithhilt.data.local.interactor.UserInteractor
import com.ioasys.dependencyinjectionwithhilt.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

//TODO 08
class RegisterViewModel @ViewModelInject constructor (
    private val userInteractor: UserInteractor) : ViewModel(){
//TODO 08

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