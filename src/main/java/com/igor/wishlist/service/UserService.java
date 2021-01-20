package com.igor.wishlist.service;

import com.igor.wishlist.controller.request.UserRequest;
import com.igor.wishlist.controller.request.UserResponse;

public interface UserService {
    UserResponse findUserById(Long userId) throws Exception;

    Long addUser(UserRequest request);
}
