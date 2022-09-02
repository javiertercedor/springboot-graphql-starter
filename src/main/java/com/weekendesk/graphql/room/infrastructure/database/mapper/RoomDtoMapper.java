package com.weekendesk.graphql.room.infrastructure.database.mapper;

import com.weekendesk.graphql.room.domain.Room;
import com.weekendesk.graphql.room.infrastructure.database.model.RoomDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoomDtoMapper {

    RoomDto fromRoom(Room room);
}
