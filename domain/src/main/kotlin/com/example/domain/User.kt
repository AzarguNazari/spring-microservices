package com.example.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.AUTO
import javax.persistence.Id

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = AUTO)
    val id: Int,
    val name: String
)