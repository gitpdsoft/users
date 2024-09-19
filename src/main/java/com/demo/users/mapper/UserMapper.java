package com.demo.users.mapper;

import com.demo.users.dto.UserDTO;
import com.demo.users.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserToUserDto(User user);
}
