package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.RoomDTO;
import co.com.olozano.hotel.Model.Room;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    Room toEntity(RoomDTO roomDTO);

    RoomDTO toDTO(Room room);
}
