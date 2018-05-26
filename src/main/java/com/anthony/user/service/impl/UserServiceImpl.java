package com.anthony.user.service.impl;

import com.anthony.user.dto.UserDTO;
import com.anthony.user.mapper.UserMapper;
import com.anthony.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public UserDTO getUserDTOByUserId(String userId) {
        List<UserDTO> userDTOS = userMapper.getUserDTO(userId);
        return userDTOS.isEmpty() ? null : userDTOS.get(0);
    }

    @Override
    public List<UserDTO> getAllUserDTO() {
        return userMapper.getUserDTO(null);
    }

    @Override
    public boolean createUserDTO(UserDTO userDTO) {
        return userMapper.addUserDTO(userDTO) == 1;
    }

    @Override
    public boolean deleteUserDTO(String userId) {
        return userMapper.deleteUserDTO(userId) == 1;
    }
}
