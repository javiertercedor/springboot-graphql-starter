package com.weekendesk.graphql.hotel.infrastructure.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelInput {

    private Long id;
    private String name;
    private String description;

}