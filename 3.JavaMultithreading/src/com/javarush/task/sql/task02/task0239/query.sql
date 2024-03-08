SELECT YEAR(date_of_birth), MONTH(date_of_birth)
FROM employee
WHERE MONTH(date_of_birth) = 12 OR MONTH(date_of_birth) = 01 OR MONTH(date_of_birth) = 02;
