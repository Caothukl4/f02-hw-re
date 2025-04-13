select * from product where category = 'ELECTRONICS';
SELECT * FROM product WHERE category = 'BOOKS';
SELECT * FROM product WHERE category = 'FASHION';
select * from users where fullname = 'a%';
select * from users where status = 'ACTIVE';
select * from product where stock <= 0;
select * from product order by price desc limit 10;