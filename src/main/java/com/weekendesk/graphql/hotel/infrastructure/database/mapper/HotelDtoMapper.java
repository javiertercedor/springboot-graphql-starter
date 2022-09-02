package com.weekendesk.graphql.hotel.infrastructure.database.mapper;

import com.weekendesk.graphql.hotel.domain.Hotel;
import com.weekendesk.graphql.hotel.infrastructure.database.model.HotelDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HotelDtoMapper {

    HotelDto fromHotel(Hotel hotel);
}
