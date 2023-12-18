select product_name
from netology.orders o
         left join netology.customers c on o.customer_id = c.id
where lower(c.name) = lower(:name);