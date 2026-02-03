package com.src.auth.services;

import com.src.auth.dtos.UserDto;


public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserEmail(String email);

    UserDto updateUser(UserDto userDto, String userId);

    void deleteUser(String userId);

    UserDto getUserById(String userId);






}
