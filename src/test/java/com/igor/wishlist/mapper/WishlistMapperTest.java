package com.igor.wishlist.mapper;

import com.igor.wishlist.controller.request.WishlistResponse;
import com.igor.wishlist.repository.entities.WishlistEntity;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;


class WishlistMapperTest {

    private WishlistMapper mapper = Mappers.getMapper(WishlistMapper.class);

    @Test
    public void testAdd() {
        assertEquals(42, Integer.sum(19, 23));
    }

    @Test
    public void testMapper() {
        WishlistEntity wishlistEntity = new WishlistEntity();
        wishlistEntity.setId(1L);
        wishlistEntity.setName("wish");
//        wishlistEntity.setPrice(1.1);
        WishlistResponse wishListResponse = mapper.mapWishListEntityToWishListResponse(wishlistEntity);

        assertNotNull(wishListResponse);
    }

    @Test
    public void testDivide() {
        assertThrows(ArithmeticException.class, () -> {
            Integer.divideUnsigned(42, 0);
        });
    }
}