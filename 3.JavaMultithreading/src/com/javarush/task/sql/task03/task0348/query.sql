with grossed_total as (select SUM(grossed) as total from films)
select AVG(total) as average_grossed from grossed_total;