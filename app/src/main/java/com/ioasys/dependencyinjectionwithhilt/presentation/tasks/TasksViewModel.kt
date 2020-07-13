package com.ioasys.dependencyinjectionwithhilt.presentation.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.ioasys.dependencyinjectionwithhilt.data.remote.service.RemoteApi
import com.ioasys.dependencyinjectionwithhilt.data.remote.response.Success
import com.ioasys.dependencyinjectionwithhilt.model.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TasksViewModel @ViewModelInject constructor(private val remoteApi: RemoteApi) : ViewModel() {

     var myTasks : List<Task> = listOf()

    suspend fun getTasks() :List<Task> = withContext(Dispatchers.IO) {
        val result = remoteApi.getTasks()
        if (result is Success){
            myTasks = result.data
        }
        return@withContext myTasks
    }
}


