package com.igor.wishlist.service.impl;

import com.igor.wishlist.repository.WishlistRepository;
import com.igor.wishlist.repository.entities.WishlistEntity;
import com.igor.wishlist.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Service
public class WishlistServiceImpl implements WishlistService {

    private final WishlistRepository wishlistRepository;

    @Override
    public List<WishlistEntity> getWishlist(Long userId) {
        return wishlistRepository.findAllById(Stream.of(userId).collect(Collectors.toList()));
    }

}
