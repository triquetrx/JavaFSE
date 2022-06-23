select user_id,count(user_id) as no_of_times from bookingdetails
group by user_id
order by user_id;