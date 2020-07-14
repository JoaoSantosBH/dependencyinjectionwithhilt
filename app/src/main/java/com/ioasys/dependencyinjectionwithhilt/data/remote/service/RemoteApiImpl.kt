package com.ioasys.dependencyinjectionwithhilt.data.remote.service

import com.ioasys.dependencyinjectionwithhilt.data.remote.response.Failure
import com.ioasys.dependencyinjectionwithhilt.data.remote.response.Result
import com.ioasys.dependencyinjectionwithhilt.data.remote.response.Success
import com.ioasys.dependencyinjectionwithhilt.domain.model.Task
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