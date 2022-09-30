package io.tamatu.ports.api;

import io.tamatu.data.UserDto;

import java.util.List;

public interface UserServicePort {

    UserDto addUser(UserDto userDto);

    void deleteUser(Long id);

    UserDto updateUser(UserDto userDto);

    List<UserDto> getUsers();

    UserDto getUser(Long id);
}
