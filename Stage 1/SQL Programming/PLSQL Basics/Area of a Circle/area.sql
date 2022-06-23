DECLARE
pl_radius number(5);
pl_area number(7,2);

BEGIN
    for i in 3..7
    LOOP
        pl_radius :=i;
        pl_area :=(3.14)*pl_radius*pl_radius;
        insert into circle(radius,area)
        values (pl_radius,pl_area);
    END LOOP;
END;
/