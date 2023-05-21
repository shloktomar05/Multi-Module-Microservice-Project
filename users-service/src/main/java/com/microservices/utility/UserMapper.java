package com.microservices.utility;

import com.microservices.model.User;
import com.microservices.models.user.request.UserRequest;
import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class UserMapper {

    public User mapUserRequestToUser(UserRequest userRequest){
        return User.builder()
                .userId(UUID.randomUUID().toString())
                .username(userRequest.getUsername())
                .email(userRequest.getEmail())
                .about(userRequest.getAbout())
                .build();
    }


}
