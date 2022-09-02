package com.weekendesk.graphql.room.infrastructure.database.repository;

import com.weekendesk.graphql.room.domain.Room;
import com.weekendesk.graphql.room.domain.RoomRepository;
import com.weekendesk.graphql.room.infrastructure.database.mapper.RoomDtoMapper;
import com.weekendesk.graphql.room.infrastructure.database.mapper.RoomMapper;
import com.weekendesk.graphql.room.infrastructure.database.model.RoomDto;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class RoomCrudRepositoryAdapter implements RoomRepository {

    private final RoomCrudRepository repository;
    private final RoomMapper roomMapper;
    private final RoomDtoMapper roomDtoMapper;

    @Override
    public Room byId(Long id) {
        final RoomDto roomDto = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Room with id %s not found".formatted(id)));
        return roomMapper.fromRoomDto(roomDto);
    }

    @Override
    public Room save(Room room) {
        final RoomDto roomDto = roomDtoMapper.fromRoom(room);
        final RoomDto save = repository.save(roomDto);
        return roomMapper.fromRoomDto(save);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Collection<Room> byHotelId(Long id) {
        Collection<Room> rooms = new HashSet<>();
        repository.findByHotelId(id).forEach(item -> rooms.add(roomMapper.fromRoomDto(item)));

        return rooms;
    }
}
