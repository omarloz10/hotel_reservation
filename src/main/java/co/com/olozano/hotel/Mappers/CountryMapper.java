package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.CountryDTO;
import co.com.olozano.hotel.Model.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    Country toEntity(CountryDTO countryDTO);

    CountryDTO toDTO(CountryDTO countryDTO);

}
