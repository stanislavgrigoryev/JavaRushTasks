select last_name from film_directors
LEFT JOIN (select grossed, director_id from films where grossed > 100) as film
on film_directors.id = film.director_id WHERE country = 'UK';