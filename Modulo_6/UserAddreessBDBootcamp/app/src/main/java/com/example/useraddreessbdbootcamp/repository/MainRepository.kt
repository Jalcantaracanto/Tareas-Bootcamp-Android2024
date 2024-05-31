package com.example.useraddreessbdbootcamp.repository

import com.example.useraddreessbdbootcamp.daos.AddressDao
import com.example.useraddreessbdbootcamp.daos.UserDao
import com.example.useraddreessbdbootcamp.entities.Address
import com.example.useraddreessbdbootcamp.entities.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainRepository(
    private val userDao: UserDao,
    private val addressDao: AddressDao
) {

    /******************************************
     *
     *  Invocación de DAOS para el usuario
     *
     *  ***********************************************
      */
   suspend fun insertUser(user: User): Long{
       return withContext(Dispatchers.IO){
           userDao.insertUser(user)
       }
   }

   suspend fun getAllUsers(): MutableList<User>{
       return withContext(Dispatchers.IO){
           userDao.getAllUser()
       }
   }

    suspend fun updateUser(user: User){
        return withContext(Dispatchers.IO){
            userDao.updateUser(user)
        }
    }

    suspend fun deleteUser(user: User){
        return withContext(Dispatchers.IO){
            userDao.deleteUser(user)
        }
    }

    /******************************************
     *
     *  Invocación de DAOS para las direcciones
     *
     *  ***********************************************
     */

    suspend fun insertAddresess(address: Address): Long  {
         return withContext(Dispatchers.IO){
             addressDao.insertAddress(address)
         }
    }

    suspend fun  getAdresessForUser(userId: Long): MutableList<Address>{
        return withContext(Dispatchers.IO){
            addressDao.getAddressForUser(userId)
        }
    }

    suspend fun updateAddress(address: Address){
        return withContext(Dispatchers.IO){
            addressDao.updateAddress(address)
        }
    }

    suspend fun deleteAddress(address: Address){
        return withContext(Dispatchers.IO){
            addressDao.deleteAddress(address)
        }
    }

}