select * from event where DATEDIFF(event.date_time, CURDATE()) > -20;