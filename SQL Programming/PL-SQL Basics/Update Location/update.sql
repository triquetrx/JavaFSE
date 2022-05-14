DECLARE
    pl_location_id department.location_id%type := 'HQ-BLR-101';

BEGIN
    update department
    set location_id = pl_location_id
    where location_id like 'HQ%';
END;
/
