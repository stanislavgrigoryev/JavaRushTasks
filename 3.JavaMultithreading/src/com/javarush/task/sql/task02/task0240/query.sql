SELECT YEAR(date_of_birth) AS experienced, MONTH(date_of_birth) AS month_of_birth, COUNT(*)
IF(YEAR(date_of_birth) < 2000,  'yes', 'no')
FROM employee
GROUP BY experienced, month_of_birth;

