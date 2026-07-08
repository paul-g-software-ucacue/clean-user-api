package com.cat.user_clean_api.application.ports.input;

import com.cat.user_clean_api.domain.model.User;

public interface UserUseCase {
    User create(User user);
}
