package com.igor.wishlist.repository;

import com.igor.wishlist.repository.entities.WishlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<WishlistEntity, Long> {

}
