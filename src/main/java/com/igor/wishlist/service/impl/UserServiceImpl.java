package com.igor.wishlist.service.impl;

import com.igor.wishlist.controller.request.UserRequest;
import com.igor.wishlist.controller.request.UserResponse;
import com.igor.wishlist.repository.UserRepository;
import com.igor.wishlist.repository.entities.User;
import com.igor.wishlist.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponse findUserById(Long userId) throws Exception {
        return null;
    }

    @Override
    public Long addUser(UserRequest request) {
        return null;
    }

    @Override
    public Optional<User> signup(String username, String password, String firstname, String lastname, String email) {
        if (userRepository.findByUsername(username).isEmpty()) {
            return Optional.of(
                    userRepository.save(
                            new User(username,
                                    passwordEncoder.encode(password),
                                    firstname,
                                    lastname,
                                    email)));
        }
        return Optional.empty();
    }
}
