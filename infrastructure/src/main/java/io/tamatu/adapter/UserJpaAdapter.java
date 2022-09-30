package io.tamatu.adapter;

import io.tamatu.data.User;
import io.tamatu.data.UserDto;
import io.tamatu.mapper.UserMapper;
import io.tamatu.ports.spi.UserPersistencePort;
import io.tamatu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserJpaAdapter implements UserPersistencePort {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        User userSaved = this.userRepository.save(user);

        return UserMapper.INSTANCE.userToUserDto(userSaved);
    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        User userUpdated = this.userRepository.save(user);

        return UserMapper.INSTANCE.userToUserDto(userUpdated);
    }

    @Override
    public List<UserDto> getUsers() {
        List<User> userList = this.userRepository.findAll();

        return UserMapper.INSTANCE.userListToUserDtoList(userList);
    }

    @Override
    public UserDto getUser(Long id) {
        Optional<User> user = this.userRepository.findById(id);

        if(user.isPresent())
            return UserMapper.INSTANCE.userToUserDto(user.get());

        return null;
    }
}
