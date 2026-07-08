package com.cat.user_clean_api.application.usecase;

import org.springframework.stereotype.Component;

import com.cat.user_clean_api.application.ports.input.UserUseCase;
import com.cat.user_clean_api.application.ports.output.UserPort;
import com.cat.user_clean_api.domain.model.User;

@Component
public class UserUseCaseImpl implements UserUseCase {

    private final UserPort userPort;

    public UserUseCaseImpl(UserPort userPort) {
        this.userPort = userPort;
    }

    @Override
    public User create(User user) {
      return userPort.create(user);
    }

}
