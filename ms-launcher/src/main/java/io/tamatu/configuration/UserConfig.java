package io.tamatu.configuration;

import io.tamatu.adapter.UserJpaAdapter;
import io.tamatu.ports.api.UserServicePort;
import io.tamatu.ports.spi.UserPersistencePort;
import io.tamatu.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserPersistencePort userPersistencePort(){
        return new UserJpaAdapter();
    }

    @Bean
    public UserServicePort userServicePort(){
        return new UserServiceImpl(userPersistencePort());
    }
}
