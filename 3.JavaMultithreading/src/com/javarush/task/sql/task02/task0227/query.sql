select prod_year, count(*) AS car_count
from cars
group by prod_year;