package io.tamatu.ports.spi;

import io.tamatu.data.UserDto;

import java.util.List;

public interface UserPersistencePort {

    UserDto addUser(UserDto userDto);

    void deleteUser(Long id);

    UserDto updateUser(UserDto userDto);

    List<UserDto> getUsers();

    UserDto getUser(Long id);
}
