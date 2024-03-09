SELECT department, position, COUNT(*) AS total
FROM employee
GROUP BY department, position
HAVING total > 1 and position = 'frontend developer'
LIMIT 1;
