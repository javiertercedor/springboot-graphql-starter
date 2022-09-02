package com.weekendesk.graphql.room.domain;

import com.weekendesk.graphql.hotel.domain.Hotel;

public record Room(Long id,
                   Long hotelId,
                   String name,
                   String description,
                   Hotel hotel) {

}
