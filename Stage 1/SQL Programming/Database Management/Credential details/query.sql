select concat(owner_name,owner_id) as username, concat(substring(owner_name,1,3),owner_id) as password 
from owners order by username asc;