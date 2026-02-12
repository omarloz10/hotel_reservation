package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.LocationDTO;
import co.com.olozano.hotel.Model.Location;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationMapper {

    Location toEntity(LocationDTO locationDTO);

    LocationDTO toDTO(Location location);
}
