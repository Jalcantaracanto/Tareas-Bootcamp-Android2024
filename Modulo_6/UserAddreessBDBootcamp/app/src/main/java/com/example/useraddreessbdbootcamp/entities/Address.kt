package com.example.useraddreessbdbootcamp.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "addresses",
    foreignKeys = [ ForeignKey(
       entity = User::class,
       parentColumns = ["userId"],
       childColumns = ["userOwnerId"],
       onDelete = ForeignKey.CASCADE
    )])
data class Address(
    @PrimaryKey( autoGenerate = true)
    val idAdress: Long = 0,
    val userOwnerId: Long = 0,
    var street: String,
    var city: String ,
    var number: Int
) {}