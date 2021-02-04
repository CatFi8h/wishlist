package com.igor.wishlist.mapper;

import com.igor.wishlist.controller.request.UserRequest;
import com.igor.wishlist.controller.request.UserResponse;
import com.igor.wishlist.repository.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "name", source = "username")
    UserResponse userToUserResponse(User entity);

    @Mappings({
            @Mapping(target = "username", source = "name"),
            @Mapping(target = "password", ignore = true),
            @Mapping(target = "firstName", ignore = true),
            @Mapping(target = "lastName", ignore = true),
            @Mapping(target = "email", ignore = true)

    })
    User mapRequestToUserEntity(UserRequest request);
}
