package com.example.useraddreessbdbootcamp.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.useraddreessbdbootcamp.entities.Address

@Dao
interface AddressDao {

    @Insert
    suspend fun insertAddress(address: Address):Long

    @Query("SELECT * FROM addresses WHERE userOwnerId = :userId")
    fun getAddressForUser(userId: Long): MutableList<Address>

    @Update
    suspend fun updateAddress(address: Address)

    @Delete
    suspend fun deleteAddress(address: Address)

}