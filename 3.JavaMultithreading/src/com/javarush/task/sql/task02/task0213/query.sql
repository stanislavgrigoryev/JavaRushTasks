select
CASE is_full_time
WHEN 1 THEN 'true'
WHEN 0 THEN 'false'
END
from students;

