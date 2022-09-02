package com.weekendesk.graphql.hotel.domain;

import java.util.Collection;

public interface HotelRepository {

    Hotel byId(Long id);

    Hotel save(Hotel hotel);

    void delete(Long id);

    Collection<Hotel> all();
}
