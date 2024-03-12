select * from film_directors
RIGHT JOIN (select title, director_id from films where year_released > 1990) as film
on film_directors.id = film.director_id WHERE country = 'USA' limit 5;