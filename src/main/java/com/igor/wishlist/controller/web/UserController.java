package com.igor.wishlist.controller.web;

import com.igor.wishlist.controller.request.UserRequest;
import com.igor.wishlist.controller.request.UserResponse;
import com.igor.wishlist.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @GetMapping(path = "/user/{id}")
    public UserResponse getUser(@PathVariable(value = "id") final Long id) throws Exception {
        return userService.findUserById(id);
    }

    @PostMapping(path = "/user")
    public Long addUser(UserRequest request) {
        return userService.addUser(request);
    }

}
