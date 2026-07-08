package com.cat.user_clean_api.infraestructure.adapters.ouput.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cat.user_clean_api.domain.model.User;
import com.cat.user_clean_api.infraestructure.adapters.ouput.UserEntity;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    //  esto es para no instanciar el mapper cada vez que lo necesite, sino que se instancia una sola vez y se reutiliza
    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);

    // esto se pone cuando tengo atributos con nombres diferentes entre la entidad y
    // el modelo de dominio
    // @Mapping(source = "firstName", target = "Name")
    UserEntity toUserEntity(User user);

    User toUser(UserEntity userEntity);

}
