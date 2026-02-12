package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.RoomTypeDTO;
import co.com.olozano.hotel.Model.RoomType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoomTypeMapper {

    RoomType toEntity(RoomTypeDTO roomTypeDTO);

    RoomTypeDTO toDTO(RoomType roomType);
}
