package co.com.olozano.hotel.DTO;

import lombok.Builder;

import java.util.UUID;
@Builder(toBuilder = true)
public record UserDTO(
        UUID id,
        String name,
        String lastname,
        String documentNumber,
        String phoneNumber,
        String email,
        CountryDTO country
) {
}
