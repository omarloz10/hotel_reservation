package co.com.olozano.hotel.DTO;

import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
public record RoleDTO(
        UUID id,
        String name,
        List<PermissionDTO> permissions
) {
}
