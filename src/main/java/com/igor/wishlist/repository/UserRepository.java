package com.igor.wishlist.repository;

import com.igor.wishlist.repository.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
