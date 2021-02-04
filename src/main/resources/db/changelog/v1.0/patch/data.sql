insert into wishlist_schema.users(user_name, user_password, first_name, last_name, email)
values ('igor', '$2a$12$Jne1TsPVKG2xlb08AeSiXe1LnTtYaFM9QxV045XC3w.CR//K78nAe', 'igor', 'yurchenko',
        'igor@yurchenko.com');

insert into wishlist_schema.security_role (role_name)
values ('USER_GUEST'),
       ('USER_USER'),
       ('USER_ADMIN');

insert into wishlist_schema.user_role_synth (user_id, role_id)
values (1, 3);