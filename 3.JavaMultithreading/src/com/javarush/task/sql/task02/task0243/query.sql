SELECT YEAR(prod_date) AS rod_year, MONTH(prod_date) AS prod_month, COUNT(*)
FROM cars
GROUP BY rod_year, prod_month;
