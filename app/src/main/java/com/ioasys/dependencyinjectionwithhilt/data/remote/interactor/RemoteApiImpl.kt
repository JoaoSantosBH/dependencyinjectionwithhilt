package com.ioasys.dependencyinjectionwithhilt.data.remote.interactor

import com.ioasys.dependencyinjectionwithhilt.data.remote.RemoteApiService
import com.ioasys.dependencyinjectionwithhilt.model.Task
import javax.inject.Inject

class RemoteApiImpl @Inject constructor(
    private val apiService: RemoteApiService
) : RemoteApi {

    override suspend fun getTasks(): Result<List<Task>> = try {
        val data = apiService.getTasks()

        Success(data.sortedBy { it.title })
    } catch (error: Throwable) {
        Failure(error)
    }
}