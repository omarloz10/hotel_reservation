package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.PermissionDTO;
import co.com.olozano.hotel.Model.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

    Permission toEntity(PermissionDTO permissionDTO);

    PermissionDTO toDTO(Permission permission);
}
