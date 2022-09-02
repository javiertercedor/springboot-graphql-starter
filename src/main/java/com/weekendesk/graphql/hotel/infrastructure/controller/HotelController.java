package com.weekendesk.graphql.hotel.infrastructure.controller;

import com.weekendesk.graphql.hotel.application.HotelService;
import com.weekendesk.graphql.hotel.domain.Hotel;
import com.weekendesk.graphql.hotel.infrastructure.controller.model.HotelInput;
import java.util.Collection;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @QueryMapping
    public Collection<Hotel> allHotels(){
        return hotelService.all();
    }

    @MutationMapping
    public Hotel saveHotel(@Argument("input") HotelInput hotelInput) {
        return hotelService.save(new Hotel(hotelInput.getId(), hotelInput.getName(), hotelInput.getDescription()));
    }
}
