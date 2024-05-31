package com.example.useraddreessbdbootcamp.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity( tableName = "users")
data class User(
    @PrimaryKey( autoGenerate = true)
    val userId: Long = 0,
    var userName: String
)
