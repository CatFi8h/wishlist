package com.igor.wishlist.service.impl;

import com.igor.wishlist.controller.request.UserRequest;
import com.igor.wishlist.controller.request.UserResponse;
import com.igor.wishlist.mapper.UserMapper;
import com.igor.wishlist.repository.UserRepository;
import com.igor.wishlist.repository.entities.UserEntity;
import com.igor.wishlist.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.directory.NoSuchAttributeException;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserResponse findUserById(Long userId) throws Exception {
        Optional<UserEntity> userEntity = repository.findById(userId);
        return mapper.userEntityToUserDto(userEntity.orElseThrow(NoSuchAttributeException::new));
    }

    @Override
    public Long addUser(UserRequest request) {
        UserEntity newUserEntity = mapper.mapRequestToUserEntity(request);
        UserEntity entity = repository.save(newUserEntity);
        return entity.getId();
    }
}
