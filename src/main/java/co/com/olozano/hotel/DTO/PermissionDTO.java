package co.com.olozano.hotel.DTO;


import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
public record PermissionDTO(
        UUID id,
        String description,
        List<RoleDTO> roles
) {
}
