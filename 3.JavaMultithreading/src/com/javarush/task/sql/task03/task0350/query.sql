with tempTable (averageGrossed) as (select avg(grossed) from films),
     tempTable2 (averageYearReleased) as (select avg(year_released) from films)
select  title, genre, year_released, grossed from films, tempTable, tempTable2
where grossed > averageGrossed and year_released > averageYearReleased
group by year_released;