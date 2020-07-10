package com.ioasys.dependencyinjectionwithhilt.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
        @PrimaryKey(autoGenerate = true)
        val id:Int? = null,
        val name: String
)