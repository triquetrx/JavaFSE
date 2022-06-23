create or replace procedure select_city
(
user_id in integer,
city_details out varchar2
)
as
begin
    select case 
    when c.city = 'Bangalore' or c.city = 'Chennai' then concat('User is from ',c.city)
    else 'User is from other cities'
    end into city_details from contact c
    where c.id = user_id;
end;
/