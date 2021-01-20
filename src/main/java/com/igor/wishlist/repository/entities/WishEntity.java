package com.igor.wishlist.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WISHES")
public class WishEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "wish_name")
    private String wishName;
    @Column(name = "wish_price")
    private Double wishPrice;
    @Column(name = "wish_description")
    private String description;
    @ManyToOne
    private WishlistEntity wishlist;
}