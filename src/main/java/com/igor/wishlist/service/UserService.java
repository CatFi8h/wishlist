package com.igor.wishlist.service;

import com.igor.wishlist.controller.request.UserRequest;
import com.igor.wishlist.controller.request.UserResponse;
import com.igor.wishlist.repository.entities.User;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {
    UserResponse findUserById(Long userId) throws Exception;

    Long addUser(UserRequest request);

    Optional<User> signup(String username, String password, String firstname, String lastname, String email);

    PageImpl<UserResponse> findAllUsers(Pageable pageable);
}
