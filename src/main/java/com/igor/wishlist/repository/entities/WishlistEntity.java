package com.igor.wishlist.repository.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "WISHLIST")
public class WishlistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "list_name")
    private String name;
    @OneToMany(targetEntity = WishEntity.class, mappedBy = "wishlist")
    private Set<WishEntity> wishEntityList;

}
