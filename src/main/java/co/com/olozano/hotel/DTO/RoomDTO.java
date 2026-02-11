package co.com.olozano.hotel.DTO;

import co.com.olozano.hotel.Model.Location;
import lombok.Builder;

import java.util.UUID;
@Builder(toBuilder = true)
public record RoomDTO(
        UUID id,
        String roomCode,
        Double price,
        RoomTypeDTO roomType,
        Location location,
        Integer totalBed,
        String status
) {
}
