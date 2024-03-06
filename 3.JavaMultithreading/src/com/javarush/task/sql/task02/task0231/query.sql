select department AS department_name, count(*) AS count
from employee
where position = 'frontend developer' OR position = 'backend developer'
group by department;
