package com.anthony.user.service;

import com.anthony.user.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getUserDTOByUserId(String userId);
    List<UserDTO> getAllUserDTO();
    boolean createUserDTO(UserDTO userDTO);
    boolean deleteUserDTO(String userId);
}
