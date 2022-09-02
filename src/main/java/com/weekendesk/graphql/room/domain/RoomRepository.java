package com.weekendesk.graphql.room.domain;

import java.util.Collection;

public interface RoomRepository {

    Room byId(Long id);

    Room save(Room room);

    void delete(Long id);

    Collection<Room> byHotelId(Long hotelId);
}
