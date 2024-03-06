select name AS car_name, count(*) AS car_count
from cars
group by name;
