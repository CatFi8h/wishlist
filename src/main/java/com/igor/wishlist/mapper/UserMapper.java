package com.igor.wishlist.mapper;

import com.igor.wishlist.controller.request.UserRequest;
import com.igor.wishlist.controller.request.UserResponse;
import com.igor.wishlist.repository.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse userEntityToUserDto(UserEntity entity);

    UserEntity mapRequestToUserEntity(UserRequest request);
}
