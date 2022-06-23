select h.hotel_id,h.hotel_name,h.hotel_type from hotel_details h
where h.hotel_id not in (select o.hotel_id from orders o
                        where month(o.order_date)='05' and year(o.order_date)='2019')
order by h.hotel_id;