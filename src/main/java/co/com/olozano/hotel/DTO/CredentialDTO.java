package co.com.olozano.hotel.DTO;


import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder(toBuilder = true)
public record CredentialDTO(
        UUID id,
        UserDTO user,
        RoleDTO role,
        String password,
        LocalDateTime lastUpdatedPassword
        ) {
}
