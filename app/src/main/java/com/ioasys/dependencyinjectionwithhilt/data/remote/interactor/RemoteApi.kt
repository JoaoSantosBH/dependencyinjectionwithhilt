package com.ioasys.dependencyinjectionwithhilt.data.remote.interactor

import com.ioasys.dependencyinjectionwithhilt.model.Task

interface RemoteApi {
    suspend fun getTasks(): Result<List<Task>>
}