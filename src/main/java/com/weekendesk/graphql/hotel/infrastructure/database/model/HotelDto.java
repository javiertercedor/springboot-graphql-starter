package com.weekendesk.graphql.hotel.infrastructure.database.model;

import com.weekendesk.graphql.room.infrastructure.database.model.RoomDto;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity(name = "Hotel")
@Data
@NoArgsConstructor
@Immutable
public class HotelDto {
    
    @Id
    private Long id;
    private String name;
    private String description;
}
