SELECT YEAR(date), MONTH(date), DAY(date), COUNT(*)
FROM event where user_id = 3 and type = 'SOLVE_TASK' and status = 'OK'
GROUP BY YEAR(date), MONTH(date), DAY(date);
