package com.karthik.foodiesapi.service;

import com.karthik.foodiesapi.io.UserRequest;
import com.karthik.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
