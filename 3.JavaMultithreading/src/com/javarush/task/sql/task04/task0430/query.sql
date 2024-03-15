SELECT YEAR(date), MONTH(date), DAY(date),COUNT(*)
FROM event GROUP BY YEAR(date), MONTH(date), DAY(date) having COUNT(*) > 5;
