select department, count(*) AS number_of_employees
from employee
group by department;
