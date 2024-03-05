select if(age <= 12, 'child', if(age <= 20, 'teenager'), if(age >= 20, 'adult')) from customers limit 5;
