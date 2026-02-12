package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.RoleDTO;
import co.com.olozano.hotel.Model.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    Role toEntity(RoleDTO roleDTO);

    RoleDTO toDTO(Role role);
}
