package com.igor.wishlist.controller.web;

import com.igor.wishlist.controller.request.UserResponse;
import com.igor.wishlist.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/admin")
public class AdminController {
    private final UserService userService;

    @GetMapping("/users")
    public PageImpl<UserResponse> getUsersList(Pageable pageable) {
        return userService.findAllUsers(pageable);
    }
}
