with tempTable (averageDOB) as (select AVG(year_born) from film_directors)
select id, full_name, year_born from film_directors, tempTable where year_born < averageDOB;