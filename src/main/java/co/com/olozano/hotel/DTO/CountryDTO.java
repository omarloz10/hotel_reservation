package co.com.olozano.hotel.DTO;


import lombok.Builder;

import java.util.UUID;

@Builder(toBuilder = true)
public record CountryDTO(
        UUID id,
        String name,
        String code2Letter,
        String code3Letter
) {
}
