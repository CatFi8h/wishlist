create table wishlist
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    list_name VARCHAR(250) NOT NULL
);
create table users
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(250) NOT NULL
);
create table wishes
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    wish_name        VARCHAR(250) NOT NULL,
    wish_price       DOUBLE,
    wish_description VARCHAR(500),
    wishlist_id      BIGINT       NOT NULL
);