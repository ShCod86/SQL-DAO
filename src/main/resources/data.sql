insert into netology.customers(name, surname, age, phone_number)
VALUES ('Oleg', 'Ivatov', 22, '8905232433'),
       ('Max', 'Ivanov', 14, '874564353'),
       ('Ivan', 'Petrov', 35, '23423423423'),
       ('Viki', 'Perova', 12, '34534536546454'),
       ('Alex', 'Sidorov', 11, '345345345'),
       ('Andry', 'Kors', 54, '13123123123');

insert into netology.orders(date, customer_id, product_name, amount)
VALUES ('2023-12-20', 1, 'ice cream', 120),
       ('2023-12-19', 2, 'milk', 84),
       ('2023-12-19', 3, 'bread', 34),
       ('2023-12-18', 4, 'strawberries', 476),
       ('2023-12-20', 5, 'cheese', 1260),
       ('2023-12-20', 6, 'apple', 500);