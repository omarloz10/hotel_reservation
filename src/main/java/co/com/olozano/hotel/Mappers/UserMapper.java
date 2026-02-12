package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.UserDTO;
import co.com.olozano.hotel.Model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDTO userDTO);

    UserDTO toDTO(User user);
}
