package com.example.domain.repository

import com.example.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<Int, User> {
    fun findByName(): List<User>
}