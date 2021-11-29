package com.utflnx.who.knows.backend.service

import com.utflnx.who.knows.backend.model.user.CreateRequest
import com.utflnx.who.knows.backend.model.ListRequest
import com.utflnx.who.knows.backend.model.user.LoginRequest
import com.utflnx.who.knows.backend.model.user.Response
import com.utflnx.who.knows.backend.model.user.UpdateRequest

interface IUserService {
    fun create(createRequest: CreateRequest): Response
    fun read(readRequest: String): Response
    fun update(id: String, updateRequest: UpdateRequest): Response
    fun delete(deleteRequest: String)
    fun list(listRequest: ListRequest): List<Response>
//    fun readExplore(): Response

    fun signIn(loginRequest: LoginRequest): Response
}