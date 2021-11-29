package com.utflnx.who.knows.backend.controller.impl

import com.utflnx.who.knows.backend.controller.IUserController
import com.utflnx.who.knows.backend.model.WebResponse
import com.utflnx.who.knows.backend.model.user.CreateRequest
import com.utflnx.who.knows.backend.model.ListRequest
import com.utflnx.who.knows.backend.model.user.LoginRequest
import com.utflnx.who.knows.backend.model.user.Response
import com.utflnx.who.knows.backend.model.user.UpdateRequest
import com.utflnx.who.knows.backend.service.IUserService
import org.springframework.web.bind.annotation.*

@RestController
class UserController(val service: IUserService): IUserController {

    @PostMapping(value = ["/api/users"], produces = ["application/json"], consumes = ["application/json"])
    override fun createUser(
        @RequestBody createRequest: CreateRequest ): WebResponse<Response>{
        val response = service.create(createRequest)

        return WebResponse(
            code = 200,
            status = "OK",
            data = response
        )
    }

    @GetMapping(value = ["/api/users/{userId}"], produces = ["application/json"])
    override fun readUser(
        @PathVariable("userId") readRequest: String): WebResponse<Response> {
        val response = service.read(readRequest)

        return WebResponse(
            code = 200,
            status = "OK",
            data = response
        )
    }

    @PutMapping(value = ["/api/users/{userId}"], produces = ["application/json"], consumes = ["application/json"])
    override fun updateUser(
        @PathVariable("userId") id: String,
        @RequestBody updateRequest: UpdateRequest): WebResponse<Response> {
        val response = service.update(id, updateRequest)

        return WebResponse(
            code = 200,
            status = "OK",
            data = response
        )
    }

    @DeleteMapping(value = ["/api/users/{userId}"], produces = ["application/json"])
    override fun deleteUser(
        @PathVariable("userId") id: String): WebResponse<String> {
        service.delete(id)

        return WebResponse(
            code = 200,
            status = "OK",
            data = id
        )
    }

    @GetMapping(value = [ "/api/users" ], produces = ["application/json"])
    override fun listUser(
        @RequestParam(value = "page", defaultValue = "0") page: Int,
        @RequestParam(value = "size", defaultValue = "10") size: Int): WebResponse<List<Response>> {
        val users = service.list(ListRequest(page, size))

        return WebResponse(
            code = 200,
            status = "OK",
            data = users
        )
    }

    @PostMapping(value = ["/api/auth/sign-in"], produces = ["application/json"], consumes = ["application/json"])
    override fun signInUser(
        @RequestBody loginRequest: LoginRequest): WebResponse<Response> {
        val response = service.signIn(loginRequest)

        return WebResponse(
            code = 200,
            status = "OK",
            data = response
        )
    }
}