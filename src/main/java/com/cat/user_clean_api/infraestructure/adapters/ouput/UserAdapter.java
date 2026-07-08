package com.cat.user_clean_api.infraestructure.adapters.ouput;

import org.springframework.stereotype.Component;

import com.cat.user_clean_api.application.ports.output.UserPort;
import com.cat.user_clean_api.domain.model.User;
import com.cat.user_clean_api.infraestructure.adapters.ouput.mapper.UserEntityMapper;

// en sprintboot no hay anotaciones para arquitectura limpia, pero se puede usar @Component para marcar la clase como un componente de Spring y permitir que sea inyectada en otras clases. Esto es útil para implementar la interfaz UserPort y proporcionar una implementación concreta de la misma.
@Component
public class UserAdapter implements UserPort {

    private final UserEntityRepository userEntityRepository;

    //  inyeccion de dependencias es delegar a un framework la responsabilidad de crear y administrar las dependencias de una clase.
    // inversion de depencias es inyectar las dependencias con lenguaje puro, es decir, no usar un framework para inyectar las dependencias, sino hacerlo manualmente.

    public UserAdapter(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public User create(User user) {
        UserEntity userEntity = userEntityRepository.save(UserEntityMapper.INSTANCE.toUserEntity(user));
        return UserEntityMapper.INSTANCE.toUser(userEntity);

    }

}
