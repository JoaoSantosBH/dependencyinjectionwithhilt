package com.ioasys.dependencyinjectionwithhilt.data.remote

import com.ioasys.dependencyinjectionwithhilt.data.model.GetTasksResponse
import com.ioasys.dependencyinjectionwithhilt.model.Task
import retrofit2.http.GET

interface RemoteApiService {

    @GET("/todos")
    suspend fun getTasks(): List<Task>

}