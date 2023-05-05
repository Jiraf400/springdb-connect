
create table IF NOT EXISTS product
(
    id          SERIAL PRIMARY KEY,
    title       varchar(100) not null,
    description varchar(100) not null,
    price       real         not null
);