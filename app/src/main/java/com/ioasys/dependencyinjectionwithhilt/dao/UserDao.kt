package com.ioasys.dependencyinjectionwithhilt.dao

import androidx.room.*
import com.ioasys.dependencyinjectionwithhilt.domain.model.User
import javax.inject.Singleton

@Dao
@Singleton
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Update
    fun updateUser(user: User)

    @Query("SELECT * FROM User order by id DESC")
    fun getUser(): User

}