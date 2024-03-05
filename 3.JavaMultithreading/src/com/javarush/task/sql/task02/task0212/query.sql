select if(position = 'manager' and salary > 10000, 'good', if(position != 'manager') and salary > 5000,'bad',
          if(position = 'manager') and salary <= 10000, 'bad') from employee where city = 'London';
