package com.example.useraddreessbdbootcamp.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.useraddreessbdbootcamp.entities.User

@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(user: User): Long

    @Query("SELECT * FROM users")
    fun getAllUser(): MutableList<User>

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)

}