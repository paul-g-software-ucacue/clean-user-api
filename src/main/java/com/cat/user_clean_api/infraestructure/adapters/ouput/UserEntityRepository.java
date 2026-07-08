package com.cat.user_clean_api.infraestructure.adapters.ouput;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository  extends JpaRepository<UserEntity, UUID> {

}
