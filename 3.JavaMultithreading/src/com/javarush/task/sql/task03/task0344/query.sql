select title from films
left join (select last_name, id from film_directors where last_name = 'Spielberg') as director
on films.director_id = director.id;