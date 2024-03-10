select customers.zip_code as cust_zip_code, orders.order_status as status
from customers LEFT JOIN orders on customers.customer_id = orders.customer_id;