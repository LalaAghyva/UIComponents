package com.sirketismi.uicomponents.repostory

import androidx.lifecycle.LiveData
import androidx.room.Query
import com.sirketismi.uicomponents.Model.User
import com.sirketismi.uicomponents.dao.UserDao

class UserRepository(private val userDao: UserDao) {
    suspend fun insert (user: User) {
        userDao.insert(user)
    }

    fun getAll(): LiveData<List<User>> {
        return userDao.getAll()
    }

}