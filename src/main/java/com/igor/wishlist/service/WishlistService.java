package com.igor.wishlist.service;

import com.igor.wishlist.repository.entities.WishlistEntity;

import java.util.List;

public interface WishlistService {
    List<WishlistEntity> getWishlist(Long userId);
}
