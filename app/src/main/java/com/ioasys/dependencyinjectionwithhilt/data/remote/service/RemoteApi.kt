package com.ioasys.dependencyinjectionwithhilt.data.remote.service

import com.ioasys.dependencyinjectionwithhilt.data.remote.response.Result
import com.ioasys.dependencyinjectionwithhilt.domain.model.Task

interface RemoteApi {
    suspend fun getTasks(): Result<List<Task>>
}