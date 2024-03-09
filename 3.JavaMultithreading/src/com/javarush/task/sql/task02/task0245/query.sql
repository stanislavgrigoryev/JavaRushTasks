SELECT name, COUNT(*)
FROM cars
GROUP BY name
having COUNT(*) > 1;