package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.CityDTO;
import co.com.olozano.hotel.Model.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {

    City toEntity(CityDTO cityDTO);

    CityDTO toDTO(City city);
}
