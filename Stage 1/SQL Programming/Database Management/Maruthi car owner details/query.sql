select distinct o.owner_id,o.owner_name,o.address,o.phone_no from owners o 
join cars c on c.owner_id = o.owner_id
where c.car_name like 'Maruthi%'
order by o.owner_id;