package com.takeo.controller;

import com.takeo.entity.UserEntity;
import com.takeo.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/home/user")
public class UserEntityController {
    private final UserServiceImpl userService;
    public String createUser(@RequestBody UserEntity userEntity){
        UserEntity createdUser = userService.createUser(userEntity);
        if (createdUser != null){
            return "User created Successfully";
        }
        return "User can not be created at this time";
    }
}
