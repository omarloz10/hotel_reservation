package co.com.olozano.hotel.Mappers;

import co.com.olozano.hotel.DTO.CredentialDTO;
import co.com.olozano.hotel.Model.Credential;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CredentialMapper {

    Credential toEntity(CredentialDTO credentialDTO);

    CredentialDTO toDTO(Credential credential);
}
