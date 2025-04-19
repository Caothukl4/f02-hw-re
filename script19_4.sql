select u.id,u.fullname , SUM(p.price * ci.quantity) as total_carts
from users u
join carts c on u.id = c.user_id
join cart_items ci on c.id = ci.cart_id
join products p on ci.product_id = p.id
group by u.id, u.fullname
order by total_carts DESC;

select distinct u.id, u.fullname, u.email
from users u
join orders o on u.id = o.user_id
where o.total_amount > 50
order by u.fullname;

select id,name , category,price
from products
where stock = 0;

select u.id,u.fullname,COUNT(ci.id) as item_count, SUM(ci.quantity)as total_quantity
FROM users u
JOIN carts c ON u.id = c.user_id
JOIN cart_items ci ON c.id = ci.cart_id
group by u.id, u.fullname
order by total_quantity DESC ;

select SUM((products.price - products.original_price) * products.stock) as total_potential_profit
from products
where stock > 0;