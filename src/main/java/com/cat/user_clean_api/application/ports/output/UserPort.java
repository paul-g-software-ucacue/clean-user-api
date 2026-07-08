package com.cat.user_clean_api.application.ports.output;

import com.cat.user_clean_api.domain.model.User;

public interface UserPort {

    User create(User user);
    
}
