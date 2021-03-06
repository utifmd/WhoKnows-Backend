package com.utflnx.who.knows.backend.mapper

import com.utflnx.who.knows.backend.entity.Room
import com.utflnx.who.knows.backend.model.room.CreateRequest
import com.utflnx.who.knows.backend.model.room.Response
import com.utflnx.who.knows.backend.model.room.UpdateRequest

interface IRoomDataMapper {
    fun toRoom(createRequest: CreateRequest): Room
    fun toRoom(current: Room, updateRequest: UpdateRequest): Room
    fun toCompleteResponse(room: Room): Response.Complete
    fun toCensoredResponse(room: Room): Response.Censored
    fun validate(any: Any)
}