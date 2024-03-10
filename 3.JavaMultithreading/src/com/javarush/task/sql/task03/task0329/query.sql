select c.customer_id, o.order_status from customers as c JOIN orders as o
ON c.customer_id = o.customer_id;