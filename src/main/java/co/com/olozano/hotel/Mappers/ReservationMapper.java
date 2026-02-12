package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.ReservationDTO;
import co.com.olozano.hotel.Model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    Reservation toEntity(ReservationDTO reservationDTO);

    ReservationDTO toDTO(Reservation reservation);
}
