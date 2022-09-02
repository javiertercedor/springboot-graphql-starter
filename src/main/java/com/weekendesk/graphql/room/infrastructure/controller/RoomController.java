package com.weekendesk.graphql.room.infrastructure.controller;

import com.weekendesk.graphql.room.application.RoomService;
import com.weekendesk.graphql.room.domain.Room;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @QueryMapping
    public Room roomById(@Argument Long id) {
        return roomService.byId(id);
    }
}
