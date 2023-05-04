create table IF NOT EXISTS product
(
    id          serial primary key,
    title       varchar(100) not null,
    description varchar(100) not null,
    price       bigserial    not null
);