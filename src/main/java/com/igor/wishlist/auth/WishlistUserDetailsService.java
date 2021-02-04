package com.igor.wishlist.auth;

import com.igor.wishlist.repository.UserRepository;
import com.igor.wishlist.repository.entities.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WishlistUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository userRepository;

    public WishlistUserDetailsService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = this.userRepository.findByUsername(username);
        return new UserPrincipal(user.orElseThrow(() ->
                new UsernameNotFoundException("Cannot fild user with username: " + username)));
    }
}
