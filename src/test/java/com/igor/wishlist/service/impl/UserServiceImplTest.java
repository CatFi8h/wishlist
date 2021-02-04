package com.igor.wishlist.service.impl;

import com.igor.wishlist.repository.entities.User;
import com.igor.wishlist.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserServiceImplTest {

    private UserService userService;


    @Test
    public void signup() {
        Optional<User> signup = userService.signup("name", "password", "firstName", "LastName", "email");
        assertThat(signup.get().getPassword(), not("password"));
        System.out.println("Encoded password:  " + signup.get().getPassword());
    }

    @Test
    public void encode() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
        String password = passwordEncoder.encode("password");
        assertNotNull(password);
        System.out.println("encoded : --->> " + password);
    }
}