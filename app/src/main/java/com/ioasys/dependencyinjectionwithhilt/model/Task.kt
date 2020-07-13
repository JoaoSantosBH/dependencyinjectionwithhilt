package com.ioasys.dependencyinjectionwithhilt.model
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable
@Serializable
data class Task(
    @SerializedName("userId")
    val userId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("completed")
    val completed: Boolean
)