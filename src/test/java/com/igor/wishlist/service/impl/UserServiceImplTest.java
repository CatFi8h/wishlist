package com.igor.wishlist.service.impl;

import com.igor.wishlist.repository.UserRepository;
import com.igor.wishlist.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserServiceImplTest {

    private UserService userService;
    @MockBean
    private UserRepository userRepository;

    @BeforeEach
    public void before() {
        userService = Mockito.mock(UserServiceImpl.class);
    }

//    @Test
//    public void signup() {
//
//        User value = new User("name", "password", "firstName","LastName", "email");
//        when(userRepository.findByUsername(anyString())).thenReturn(Optional.of(value));
//        when(userRepository.save(any())).thenReturn(value);
//        Optional<User> signup = userService.signup(
//                "name",
//                "password",
//                "firstName",
//                "LastName",
//                "email");
//        assertTrue(signup.isPresent());
//        assertThat(signup.get().getPassword(), not("password"));
//        System.out.println("Encoded password:  " + signup.get().getPassword());
//    }

    @Test
    public void encode() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
        String password = passwordEncoder.encode("password");
        assertNotNull(password);
        System.out.println("encoded : --->> " + password);
    }
}