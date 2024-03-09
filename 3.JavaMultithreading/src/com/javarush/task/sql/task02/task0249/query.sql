SELECT department, position, COUNT(*) AS total
FROM employee
WHERE position = 'backend developer'
GROUP BY department, position
HAVING total = 1;
