CREATE SCHEMA IF NOT EXISTS wishlist_schema;

CREATE TABLE wishlist_schema.users
(
    id            SERIAL PRIMARY KEY,
    user_name     VARCHAR(40)         NOT NULL,
    user_password VARCHAR(200)        NOT NULL,
    first_name    VARCHAR(40),
    last_name     VARCHAR(40),
    email         VARCHAR(150) UNIQUE NOT NULL
);

CREATE TABLE wishlist_schema.wishlists
(
    id            SERIAL PRIMARY KEY,
    wishlist_name VARCHAR(120) NOT NULL,
    user_id       BIGINT       NOT NULL
);

CREATE TABLE wishlist_schema.wishes
(
    id               SERIAL PRIMARY KEY,
    wish_name        VARCHAR(200) NOT NULL,
    wish_price       DECIMAL,
    wish_description VARCHAR(500),
    wishlist_id      BIGINT       NOT NULL
);

ALTER TABLE wishlist_schema.wishes
    ADD FOREIGN KEY (wishlist_id) REFERENCES wishlist_schema.wishlists (id);
ALTER TABLE wishlist_schema.wishlists
    ADD FOREIGN KEY (user_id) REFERENCES wishlist_schema.users (id);

CREATE TABLE wishlist_schema.security_role
(
    id          SERIAL PRIMARY KEY,
    role_name   VARCHAR(120) NOT NULL,
    description VARCHAR(200)
);

CREATE TABLE wishlist_schema.user_role_synth
(
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL
);

ALTER TABLE wishlist_schema.user_role_synth
    ADD FOREIGN KEY (user_id) REFERENCES wishlist_schema.users (id);
ALTER TABLE wishlist_schema.user_role_synth
    ADD FOREIGN KEY (role_id) REFERENCES wishlist_schema.security_role (id);

