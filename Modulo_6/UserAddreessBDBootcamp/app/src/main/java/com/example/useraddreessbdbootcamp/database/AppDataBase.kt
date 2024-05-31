package com.example.useraddreessbdbootcamp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.useraddreessbdbootcamp.daos.AddressDao
import com.example.useraddreessbdbootcamp.daos.UserDao
import com.example.useraddreessbdbootcamp.entities.Address
import com.example.useraddreessbdbootcamp.entities.User

// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = arrayOf(User::class, Address::class), version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun addressDao(): AddressDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "addresses_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}