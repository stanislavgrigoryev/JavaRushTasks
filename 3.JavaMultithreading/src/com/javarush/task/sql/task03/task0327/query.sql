select customers. city, orders.store_id from customers RIGHT JOIN orders on customers.customer_id = orders.customer_id
WHERE orders.order_status = 'SHIPPED' and orders.total_cost > 100;
