package co.com.olozano.hotel.DTO;

import co.com.olozano.hotel.Model.City;
import lombok.Builder;

import java.util.UUID;

@Builder(toBuilder = true)
public record LocationDTO(
        UUID id,
        String name,
        String address,
        City city,
        String phoneNumber
) {
}
