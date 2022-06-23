select h.hotel_id, h.hotel_name, COUNT(o.order_id) as NO_OF_ORDERS 
from orders o, hotel_details h
where h.hotel_id = o.hotel_id
group by h.hotel_id
having COUNT(o.order_id) > 5
order by h.hotel_id;