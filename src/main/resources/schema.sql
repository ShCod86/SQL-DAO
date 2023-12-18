create schema netology;

create table netology.customers
(
    id           serial primary key,
    name         varchar(50),
    surname      varchar(50),
    age          int,
    phone_number varchar
);

create table netology.orders
(
    id           serial primary key,
    date         date,
    customer_id  int,
    product_name varchar,
    amount       int check (amount > 0),
    foreign key (customer_id) references netology.customers (id)
);