select o.order_id,c.customer_name,h.hotel_name,o.order_amount from orders o
join customers c on c.customer_id = o.customer_id
join hotel_details h on h.hotel_id = o.hotel_id
order by o.order_id;