package com.anthony.user.mapper;

import com.anthony.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDTO> getUserDTO(String userId);
    int addUserDTO(UserDTO userDTO);
    int deleteUserDTO(String userId);
}
