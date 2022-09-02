package com.weekendesk.graphql.hotel.domain;

import com.weekendesk.graphql.room.domain.Room;
import java.util.List;

public record Hotel(Long id,
                    String name,
                    String description) {

}
