package com.rafaelvieira.springactuator.dto.mapper;

import com.rafaelvieira.springactuator.dto.UserDTO;
import com.rafaelvieira.springactuator.entity.User;

public class UserMapper {

    public static User fromDTO(UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setBirthday(dto.getBirthday());
        user.setActive(dto.isActive());
        return user;
    }

}
