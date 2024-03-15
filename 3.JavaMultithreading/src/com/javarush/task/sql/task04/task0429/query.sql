select * from event where date_time between date_sub(date_time, interval 14 day ) - curdate();
