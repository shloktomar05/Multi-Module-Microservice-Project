package com.microservices.service;

import com.microservices.models.user.response.UserResponse;
import com.microservices.models.user.request.UserRequest;
import com.microservices.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserResponse createUser(UserRequest userRequest) {
        return null;
    }
}
