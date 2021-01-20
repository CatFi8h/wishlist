package com.igor.wishlist.mapper;

import com.igor.wishlist.controller.request.WishlistResponse;
import com.igor.wishlist.repository.entities.WishlistEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class WishlistMapper {

    public WishlistResponse mapWishListEntityToWishListResponse(WishlistEntity entity) {
        WishlistResponse response = new WishlistResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
//        response.setPrice(entity.getPrice());
        return response;
    }
}
