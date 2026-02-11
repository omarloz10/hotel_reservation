package co.com.olozano.hotel.DTO;

import lombok.Builder;

import java.util.UUID;

@Builder(toBuilder = true)
public record RoomTypeDTO(
        UUID id,
        String type
) {
}
