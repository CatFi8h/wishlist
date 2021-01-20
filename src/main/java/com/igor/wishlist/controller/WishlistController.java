package com.igor.wishlist.controller;

import com.igor.wishlist.controller.request.WishlistResponse;
import com.igor.wishlist.mapper.WishlistMapper;
import com.igor.wishlist.repository.entities.WishlistEntity;
import com.igor.wishlist.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {

    private final WishlistService wishlistService;
    private final WishlistMapper wishlistMapper;

    @GetMapping("/{userId}")
    private List<WishlistResponse> getList(@Param("userId") Long userId) {
        List<WishlistEntity> list = wishlistService.getWishlist(userId);

        List<WishlistResponse> arrayList = new ArrayList<>();
        for (WishlistEntity wishlistEntity : list) {
            WishlistResponse wishlistResponse = wishlistMapper.mapWishListEntityToWishListResponse(wishlistEntity);
            arrayList.add(wishlistResponse);
        }
        return arrayList;
    }
}
