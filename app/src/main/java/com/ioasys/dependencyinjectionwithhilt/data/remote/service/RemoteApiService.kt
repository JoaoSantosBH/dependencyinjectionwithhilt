package com.ioasys.dependencyinjectionwithhilt.data.remote.service

import com.ioasys.dependencyinjectionwithhilt.domain.model.Task
import retrofit2.http.GET

interface RemoteApiService {

    @GET("/todos")
    suspend fun getTasks(): List<Task>

}