package io.tamatu.service;

import io.tamatu.data.UserDto;
import io.tamatu.ports.api.UserServicePort;
import io.tamatu.ports.spi.UserPersistencePort;

import java.util.List;

public class UserServiceImpl implements UserServicePort {

    private UserPersistencePort userPersistencePort;

    public UserServiceImpl(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        return this.userPersistencePort.addUser(userDto);
    }

    @Override
    public void deleteUser(Long id) {
        this.userPersistencePort.deleteUser(id);
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return this.userPersistencePort.updateUser(userDto);
    }

    @Override
    public List<UserDto> getUsers() {
        return this.userPersistencePort.getUsers();
    }

    @Override
    public UserDto getUser(Long id) {
        return userPersistencePort.getUser(id);
    }
}
