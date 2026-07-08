package com.cat.user_clean_api.infraestructure.adapters.input;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cat.user_clean_api.application.ports.input.UserUseCase;
import com.cat.user_clean_api.domain.model.User;
import com.cat.user_clean_api.infraestructure.adapters.input.dto.UserRequest;
import com.cat.user_clean_api.infraestructure.adapters.input.dto.UserResponse;
import com.cat.user_clean_api.infraestructure.adapters.ouput.mapper.UserRequestMapper;

// http://localhost:8080/dominio/context

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserUseCase userUseCase;

    public UserController(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping
    ResponseEntity<UserResponse> create(@RequestBody UserRequest request) {
        User user = userUseCase.create(UserRequestMapper.INSTANCE.toUser(request));
        return new ResponseEntity<>(UserRequestMapper.INSTANCE.toUserResponse(user), HttpStatus.CREATED);

    }
}
