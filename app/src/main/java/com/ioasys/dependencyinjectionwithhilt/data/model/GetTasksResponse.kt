package com.ioasys.dependencyinjectionwithhilt.data.model

import com.ioasys.dependencyinjectionwithhilt.model.Task
import kotlinx.serialization.Serializable

@Serializable
data class GetTasksResponse(val tasks: List<Task> = listOf())