select c.car_id,c.car_name,c.car_type from cars c
where c.car_id not in (select r.car_id from rentals r)
order by c.car_id;