package com.cat.user_clean_api.infraestructure.adapters.ouput.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cat.user_clean_api.domain.model.User;
import com.cat.user_clean_api.infraestructure.adapters.input.dto.UserRequest;
import com.cat.user_clean_api.infraestructure.adapters.input.dto.UserResponse;

@Mapper(componentModel = "spring")
public interface UserRequestMapper {
    UserRequestMapper INSTANCE = Mappers.getMapper(UserRequestMapper.class);

    User toUser(UserRequest userRequest);

    UserResponse toUserResponse(User user);

}
