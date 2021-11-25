package com.utflnx.who.knows.backend.model.user

import java.util.*

data class Response(
    val userId: String,
    val fullName: String,
    val email: String,
    val phone: Int,
    val username: String,
    val password: String,
    val createdAt: Date,
    val updatedAt: Date?
)