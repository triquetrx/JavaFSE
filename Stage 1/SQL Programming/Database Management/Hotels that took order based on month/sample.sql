select distinct h.hotel_id,h.hotel_name,h.rating from orders o
join hotel_details h on o.hotel_id = h.hotel_id
where Month(o.order_date) = '7'
order by h.hotel_id asc;