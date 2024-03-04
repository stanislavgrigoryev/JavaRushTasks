select brand, model, quantity, booked_quantity from car where model
in  ('renault', 'opel', 'seat', 'skoda') OR quantity - booked_quantity < 10;
