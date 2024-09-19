package com.demo.users.service;

import com.demo.users.dto.UserDTO;
import com.demo.users.entity.User;
import com.demo.users.mapper.UserMapper;
import com.demo.users.repository.UserRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public UserDTO save(UserDTO userDTO) {
        User user = repository.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));
        return UserMapper.INSTANCE.mapUserToUserDto(user);
    }

    public UserDTO findById(Integer id) {
        Optional<User> user = repository.findById(id);
        return user.map(UserMapper.INSTANCE::mapUserToUserDto).orElse(null);
    }
}
