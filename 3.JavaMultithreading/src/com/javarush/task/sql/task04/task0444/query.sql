SELECT CONCAT(city, '-', CHAR_LENGTH(city)) FROM cities ORDER BY CHAR_LENGTH(city) ASC limit 3;
