package com.example.useraddreessbdbootcamp.viewmodels.user

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.useraddreessbdbootcamp.entities.User
import com.example.useraddreessbdbootcamp.repository.MainRepository
import kotlinx.coroutines.launch

class UserViewModel(
    application: Application,
    private var repository: MainRepository
) : AndroidViewModel(application) {

    private val _userList = MutableLiveData<MutableList<User>>()
    val usersLV: LiveData<MutableList<User>>
        get() = _userList

    init {
        viewModelScope.launch {
            _userList.value = repository.getAllUsers()
        }
    }

    fun getAllUser() = viewModelScope.launch {
        _userList.value = repository.getAllUsers()
    }

    fun insertUser(user: User, onInserted: (Long) -> Unit) = viewModelScope.launch {
        val userId = repository.insertUser(user)
        onInserted(userId)
        _userList.value = repository.getAllUsers()
    }

    fun updateUser(user: User) = viewModelScope.launch {
        repository.updateUser(user)
        _userList.value = repository.getAllUsers()
    }

    fun deleteUser(user: User) = viewModelScope.launch {
        repository.deleteUser(user)
        _userList.value = repository.getAllUsers()
    }
}