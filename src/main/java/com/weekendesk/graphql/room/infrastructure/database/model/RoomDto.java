package com.weekendesk.graphql.room.infrastructure.database.model;

import com.weekendesk.graphql.hotel.infrastructure.database.model.HotelDto;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity(name = "Room")
@Data
@NoArgsConstructor
@Immutable
public class RoomDto {

    @Id
    private Long id;
    private Long hotelid;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "hotelid", insertable = false, updatable = false)
    private HotelDto hotel;
}
