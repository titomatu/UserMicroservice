package io.tamatu.mapper;

import io.tamatu.data.User;
import io.tamatu.data.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);

    List<UserDto> userListToUserDtoList(List<User> userList);

    List<User> userDtoListToUserList(List<UserDto> userDtoList);
}
