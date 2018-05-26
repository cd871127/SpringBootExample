package com.anthony.user.controller;

import com.anthony.common.AbstractController;
import com.anthony.common.ServerResponse;
import com.anthony.user.dto.UserDTO;
import com.anthony.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "{userId}", method = GET)
    public ServerResponse<UserDTO> getUserInfoByUserId(@PathVariable String userId) {
        UserDTO userDTO = userService.getUserDTOByUserId(userId);
        ServerResponse<UserDTO> serverResponse = new ServerResponse<>();
        serverResponse.setData(userDTO);
        return serverResponse;
    }

    @RequestMapping(method = GET)
    public ServerResponse<List<UserDTO>> getAllUserInfo() {
        List<UserDTO> userDTOList = userService.getAllUserDTO();
        ServerResponse<List<UserDTO>> serverResponse = new ServerResponse<>();
        serverResponse.setData(userDTOList);
        return serverResponse;
    }

    @RequestMapping(method = POST)
    public ServerResponse<UserDTO> createUser(UserDTO userDTO) {
        ServerResponse<UserDTO> serverResponse = new ServerResponse<>();
        if (userService.createUserDTO(userDTO))
            serverResponse.setData(userDTO);
        return serverResponse;
    }

    @RequestMapping(value = "{userId}", method = DELETE)
    public ServerResponse<UserDTO> deleteUserByUserId(@PathVariable String userId) {
        ServerResponse<UserDTO> serverResponse = new ServerResponse<>();
        UserDTO userDTO = userService.getUserDTOByUserId(userId);
        if (userDTO != null && userService.deleteUserDTO(userId))
            serverResponse.setData(userDTO);
        return serverResponse;
    }

    @RequestMapping(value = "{userId}", method = PATCH)
    public ServerResponse modifyPassWd(@PathVariable String userId) {
        return null;
    }

    @RequestMapping(value = "{userId}", method = PUT)
    public ServerResponse modifyUserDTO(@PathVariable String userId, UserDTO userDTO) {
        return null;
    }

}
