package com.microservices.controller;

import com.microservices.models.user.response.UserResponse;
import com.microservices.models.user.request.UserRequest;
import com.microservices.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/user/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserResponse createUser(@RequestBody UserRequest userRequest){
        return userService.createUser(userRequest);
    }



}
