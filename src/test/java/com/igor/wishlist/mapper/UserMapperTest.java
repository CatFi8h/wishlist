package com.igor.wishlist.mapper;

import com.igor.wishlist.controller.request.UserRequest;
import com.igor.wishlist.repository.entities.UserEntity;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserMapperTest {

    public UserMapper mapper = Mappers.getMapper(UserMapper.class);

    @Test
    public void validUserMapRequestToEntity() {
        String testName = "testName";
        UserRequest userRequest = new UserRequest(null, testName);
        UserEntity userEntity = mapper.mapRequestToUserEntity(userRequest);
        assertNotNull(userEntity);
        assertEquals(testName, userEntity.getName());
    }
}